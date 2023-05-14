package com.example.demo.c_return;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-09
 * Time: 18:34
 */
@Controller
public class C_Redirect {
    @RequestMapping("redirect")
    public String redirect() {
        return "redirect:/hello";
    }
}