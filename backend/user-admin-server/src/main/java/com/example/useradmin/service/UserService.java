package com.example.useradmin.service;

import com.example.useradmin.entity.User;
import com.example.useradmin.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service  // 这个注解必须有！
public class UserService {

    @Autowired
    private UserMapper userMapper;

    // 方法名必须和 Controller 里调用的完全一致
    public List<User> list() {
        return userMapper.findAll();
    }

    public int add(User user) {
        return userMapper.add(user);
    }

    public int delete(Integer id) {
        return userMapper.delete(id);
    }
}