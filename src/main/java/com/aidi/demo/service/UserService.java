package com.aidi.demo.service;

import com.aidi.demo.pojo.User;

public interface UserService {

    User saveUser(User user);

    User selectByUserId(int id);
}
