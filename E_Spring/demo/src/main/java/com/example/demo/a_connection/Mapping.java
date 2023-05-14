package com.example.demo.a_connection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-09
 * Time: 17:21
 */
@RestController
@RequestMapping("/connection")
public class Mapping {
    @RequestMapping("/request")
    public String sayHi() {
        return "/index.html";
    }

    @GetMapping("/get")
    public String sayHi2() {
        return "Hello Get";
    }

    @PostMapping("/post")
    public String sayHi3() {
        return "Hello Post";
    }
}