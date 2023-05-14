package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 林堉霞
 * Date: 2023-05-13
 * Time: 17:12
 */
@Mapper
public interface UserMapper {
    public User getUserById(Integer id);
}
