package com.nilswang.dubbo.service.impl;

import com.nilswang.dubbo.pojo.User;
import com.nilswang.dubbo.service.UserService;

/**
 * @author wangminze
 * @create 2020-08-19-9:50
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id, String userName) {

        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        return user;
    }

}
