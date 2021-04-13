package com.mapper;


import com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper{


    User queryObject(String email);

    List<User> queryList(Map<String, Object> map);

    User findAll(User user);
}
