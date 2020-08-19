package com.nilswang.dubbo.service.impl;

import com.nilswang.dubbo.pojo.User;
import com.nilswang.dubbo.service.UserService;

/**
 * @author wangminze
 * @create 2020-08-18-19:32
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {

        User user = new User();
        user.setId(id);
        user.setUserName("张三");
        user.setUserAge(18);
        return user;

    }
}
