package com.nilswang.dubbo.controller;

import com.nilswang.dubbo.pojo.User;
import com.nilswang.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangminze
 * @create 2020-08-19-8:03
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("userService1")
    private UserService userService1;

    @Autowired
    @Qualifier("userService2")
    private UserService userService2;

    @RequestMapping("/user")
    public String userDetail(Model model, Integer id, String userName){

        User user = userService1.queryUserById(id,userName);
        User user2 = userService2.queryUserById(id,userName);

        model.addAttribute("user", user);
        model.addAttribute("user2", user2);

        return "userDetail";
    }

}
