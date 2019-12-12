package com.gzsdkt.pdemo.service.Impl;

import com.gzsdkt.pdemo.pojo.TestUser;
import com.gzsdkt.pdemo.service.TestService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@CacheConfig(cacheNames = "Users")
@Transactional
public class TestServiceImpl implements TestService {
    @Override
    @Cacheable(key = "MykeyGenerator")
    public TestUser findNameById(int uid) {
        return null;
    }

    @Override
    @CacheEvict(key = "MykeyGenerator")
    public boolean delUserById(int id) {
        return false;
    }

    @Override
    @CachePut(key = "MykeyGenerator")
    public int addUserInRedis(TestUser user) {
        return 1;
    }
}
