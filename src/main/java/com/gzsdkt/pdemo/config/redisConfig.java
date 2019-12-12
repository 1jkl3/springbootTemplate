package com.gzsdkt.pdemo.config;

import com.gzsdkt.pdemo.util.FastJsonRedisSerializer;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.cache.interceptor.KeyGenerator;
import java.lang.reflect.Method;

@Configuration
@EnableCaching
/**
 * 设置redis模板，序列化方式
 */
public class redisConfig extends CachingConfigurerSupport {
    @Bean
    public KeyGenerator MykeyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName());
                sb.append(method.getName());
                for (Object obj : params) {
                    sb.append(obj.toString());
                }
                return sb.toString();
            }
        };
    }
    @Bean
    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
        RedisCacheManager.RedisCacheManagerBuilder builder = RedisCacheManager
                .RedisCacheManagerBuilder
                .fromConnectionFactory(redisConnectionFactory);
        return builder.build();
    }
    /**
     * 对象类型运用
     * @param factory
     * @return
     */
    @Bean
    public RedisTemplate<Object,Object> redisTemplate(RedisConnectionFactory  factory){
        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
        //创建jackson方式序列化
        FastJsonRedisSerializer serializer = new FastJsonRedisSerializer(Object.class);
        //key
        redisTemplate.setKeySerializer(serializer);
        redisTemplate.setHashKeySerializer(serializer);
        //value
        redisTemplate.setValueSerializer(serializer);
        redisTemplate.setHashValueSerializer(serializer);
        redisTemplate.setConnectionFactory(factory);
        return redisTemplate;
    }
}
