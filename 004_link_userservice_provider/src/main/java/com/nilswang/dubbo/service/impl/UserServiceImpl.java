package com.nilswang.dubbo.service.impl;

import com.nilswang.dubbo.pojo.User;
import com.nilswang.dubbo.service.UserService;

/**
 * @author wangminze
 * @create 2020-08-19-7:30
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(1001);
        user.setUserName("张三");

        return user;
    }

    @Override
    public Integer queryUserAllCount() {
        return 100;
    }
}
