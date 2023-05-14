package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-14
 * Time: 12:04
 */
@Mapper
public interface UserMapper {
    public User getUserById(Integer id);
}
