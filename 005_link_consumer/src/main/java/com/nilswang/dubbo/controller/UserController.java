package com.nilswang.dubbo.controller;

import com.nilswang.dubbo.pojo.User;
import com.nilswang.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private UserService userService;

    @RequestMapping("/user")
    public String userDetail(Model model, Integer id){

        User user = userService.queryUserById(id);
        int count = userService.queryUserAllCount();

        model.addAttribute("user", user);
        model.addAttribute("count", count);

        return "userDetail";
    }

}
