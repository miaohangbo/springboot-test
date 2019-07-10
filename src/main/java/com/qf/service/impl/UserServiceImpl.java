package com.qf.service.impl;

import com.qf.dao.UserMapper;
import com.qf.domain.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 54110 on 2019-07-08.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findList() {
        return userMapper.findList();
    }
}
