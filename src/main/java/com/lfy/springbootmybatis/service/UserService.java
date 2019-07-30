package com.lfy.springbootmybatis.service;

import com.lfy.springbootmybatis.bean.User;
import com.lfy.springbootmybatis.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insert(User user){
        userMapper.insert(user);
    }

    public void delete(String id){
        userMapper.delete(id);
    }

    public void update(User user){
        userMapper.update(user);
    }

    public User findById(String id){
        return userMapper.selectById(id);
    }
}
