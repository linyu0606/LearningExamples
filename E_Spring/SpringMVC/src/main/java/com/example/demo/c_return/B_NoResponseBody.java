package com.example.demo.c_return;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-09
 * Time: 18:08
 */
@Controller
public class B_NoResponseBody {
    @RequestMapping("world")
    public String world() {
        return "forward:/hello";
    }
}
