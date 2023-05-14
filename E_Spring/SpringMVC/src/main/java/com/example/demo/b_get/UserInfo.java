package com.example.demo.b_get;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-13
 * Time: 16:41
 */
@Data
public class UserInfo {
    // 属性
    public String username;

    public String password;

    // 动作（方法）
    public String chifan(){
        return "我在吃饭";
    }
}
