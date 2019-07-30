package com.lfy.springbootmybatis.dao;

import com.lfy.springbootmybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    void insert(User user);
    void delete(String id);
    void update(User user);
    User selectById(String id);
}
