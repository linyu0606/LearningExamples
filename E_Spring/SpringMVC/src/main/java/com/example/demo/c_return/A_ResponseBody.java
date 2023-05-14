package com.example.demo.c_return;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-09
 * Time: 17:38
 */

@Controller
@ResponseBody
public class A_ResponseBody {
    @RequestMapping("hello")
    public String hello() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "红红火火恍恍惚惚或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或\n" +
                "</body>\n" +
                "</html>";
    }
}