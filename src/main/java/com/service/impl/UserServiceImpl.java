package com.service.impl;

import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryObject(String email){
        return userMapper.queryObject(email);
    }
    @Override
    public List<User> queryList(Map<String,Object> map){
        return userMapper.queryList(map);
    }
    @Override
    public User queryLogin(User user) {
        String email = user.getEmail();
        User user1 = new User();
        user1.setEmail(email);
        return user;
    }
}
