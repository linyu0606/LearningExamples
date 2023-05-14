package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-14
 * Time: 12:02
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getuserbyid")
    public User getUserById(Integer id){
        return userService.getUserById(id);
    }
}
