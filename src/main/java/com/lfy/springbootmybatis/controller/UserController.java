package com.lfy.springbootmybatis.controller;

import com.lfy.springbootmybatis.bean.User;
import com.lfy.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public void insert(@RequestBody User user){
        userService.insert(user);
    }

    @PutMapping("/user")
    public void update(@RequestBody User user){
        userService.update(user);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable String id){
        userService.delete(id);
    }

    @GetMapping("user/{id}")
    public User findById(@PathVariable String id){
        return userService.findById(id);
    }

}
