package com.example.demo.b_get;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-13
 * Time: 16:36
 */

/**
 * 接收对象
 */
@Controller
@ResponseBody
public class B_GetObject {
    @RequestMapping("/getobject")
    public String getobject(UserInfo userInfo){
        return "userInfo为："+userInfo;
    }
}
