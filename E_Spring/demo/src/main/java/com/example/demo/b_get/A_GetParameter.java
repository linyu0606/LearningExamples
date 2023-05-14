package com.example.demo.b_get;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-13
 * Time: 16:22
 */

/**
 * 返回参数的实例
 */
@Controller
@ResponseBody
public class A_GetParameter {
    @RequestMapping("/getparameter")
    public String getID(String id,String b){
        return "id：" + id +"  b: " + b;
    }
}
