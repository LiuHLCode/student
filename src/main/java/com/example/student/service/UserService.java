package com.example.student.service;

import com.example.student.pojo.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
    PageInfo<User> findAll(Integer offset, Integer limit);
}
