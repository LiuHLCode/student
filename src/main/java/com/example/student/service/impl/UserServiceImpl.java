package com.example.student.service.impl;

import com.example.student.mapper.UserMapper;
import com.example.student.pojo.User;
import com.example.student.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> findAll(Integer offset, Integer limit) {
        PageHelper.startPage(offset, limit);
        List<User> users = userMapper.findAll();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        return userPageInfo;
    }
}
