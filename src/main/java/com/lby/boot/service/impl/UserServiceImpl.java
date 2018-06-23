package com.lby.boot.service.impl;

import com.lby.boot.mapper.UserMapper;
import com.lby.boot.model.User;
import com.lby.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    UserMapper mapper;

    @Override
    public User getUserById(int id)
    {
        return mapper.getUserById(id);
    }
}