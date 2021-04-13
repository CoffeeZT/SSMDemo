package com.service;

import com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    User queryObject(String email);
    List<User> queryList(Map<String, Object>map);
    User queryLogin(User user);
}
