package com.springboot.mapper;

import com.springboot.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ASUS on 2019/9/10.
 */
@Mapper
public interface UserMapper {

    @Select("select id,username from users where age = #{age}")
    List<Users> getUser(int age);

}
