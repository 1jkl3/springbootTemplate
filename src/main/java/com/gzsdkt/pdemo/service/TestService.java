package com.gzsdkt.pdemo.service;

import com.gzsdkt.pdemo.pojo.TestUser;

public interface TestService {
    TestUser findNameById(int uid);

    boolean delUserById(int id);

    int addUserInRedis(TestUser user);
}
