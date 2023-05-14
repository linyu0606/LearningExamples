package com.example.demo.controller;

import com.example.demo.b_get.UserInfo;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-13
 * Time: 17:16
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getuserbyid")
    public User getUserById(Integer id){
        if (id == null)
            return null;
        return userService.getUserById(id);
    }
}
