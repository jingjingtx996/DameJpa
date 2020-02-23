package com.aidi.demo.controller;

import com.aidi.demo.pojo.User;
import com.aidi.demo.service.UserService;
import com.aidi.demo.utils.TimeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(value = "用户")
@RestController
@RequestMapping(value = "/user/")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "新增用户")
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        if (user.getUserTime() != null) {
            // 根据日期算出年纪
            user.setUserAge(TimeUtil.getAgeByBirthday(user.getUserTime()));
        }
        return userService.saveUser(user);
    }

    @ApiOperation(value = "查询用户信息")
    @RequestMapping(value = "selectByUserId/{id}", method = RequestMethod.GET)
    public String selectByUserId(@PathVariable Integer id) {
        User user = userService.selectByUserId(id);
        if (user.getUserTime() != null) {
            // 根据日期算出年纪
            user.setUserAge(TimeUtil.getAgeByBirthday(user.getUserTime()));
        }
        return user.toString();
    }
}
