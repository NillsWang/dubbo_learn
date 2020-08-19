package com.nilswang.dubbo.controller;

import com.nilswang.dubbo.pojo.User;
import com.nilswang.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangminze
 * @create 2020-08-18-21:42
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String userDetail(Model model, Integer id){

        User user = userService.queryUserById(id);
        model.addAttribute("user",user);
        return "userDetail";
    }

}
