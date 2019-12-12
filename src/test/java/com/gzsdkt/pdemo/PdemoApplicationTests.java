package com.gzsdkt.pdemo;

import com.gzsdkt.pdemo.pojo.TestUser;
import com.gzsdkt.pdemo.service.TestService;
import com.gzsdkt.pdemo.util.Logutils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
class PdemoApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private TestService service;
    @Test
    void useSerletRedis() {
        Logger dbLogger = new Logutils().getDBLogger();
        ArrayList<String> list = new ArrayList<>();
        service.addUserInRedis(new TestUser(1,"张家辉  ",list));
        TestUser id = service.findNameById(1);
        dbLogger.info("这是user的数据:{}",id);
    }
    @Test
    void useRedisTemplate(){

    }
}
