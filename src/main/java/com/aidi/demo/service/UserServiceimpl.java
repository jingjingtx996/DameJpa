package com.aidi.demo.service;

import com.aidi.demo.dao.UserJpa;
import com.aidi.demo.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceimpl implements UserService {

    @Resource
    UserJpa userJpa;


    @Override
    public User saveUser(User user) {
        return userJpa.save(user);
    }

    @Override
    public User selectByUserId(int id) {
        Optional<User> optionalUser = userJpa.findById(id);
        return optionalUser.get();
    }
}
