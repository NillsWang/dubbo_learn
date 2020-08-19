package com.nilswang.dubbo.service;

import com.nilswang.dubbo.pojo.User;

/**
 * @author wangminze
 * @create 2020-08-18-19:31
 */
public interface UserService {

    User queryUserById(Integer id);

}
