package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-14
 * Time: 12:03
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }
}
