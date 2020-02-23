package com.aidi.demo.dao;

import com.aidi.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface UserJpa extends JpaRepository<User, Integer> {
}
