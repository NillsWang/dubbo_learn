package com.nilswang.dubbo.service;

import com.nilswang.dubbo.pojo.User;

/**
 * @author wangminze
 * @create 2020-08-19-7:24
 */
public interface UserService {

    User queryUserById(Integer id);

    Integer queryUserAllCount();

}
