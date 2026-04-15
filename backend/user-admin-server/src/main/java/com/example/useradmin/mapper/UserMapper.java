package com.example.useradmin.mapper;

import com.example.useradmin.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user order by id desc")
    List<User> findAll();

    @Insert("insert into user(username,age,phone) values(#{username},#{age},#{phone})")
    int add(User user);

    @Delete("delete from user where id=#{id}")
    int delete(Integer id);
}