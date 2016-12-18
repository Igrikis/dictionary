package com.project.vocabulary.service.impl;

import com.project.vocabulary.dao.UserDao;
import com.project.vocabulary.entity.Users;
import com.project.vocabulary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public List<Users> getUserList() {
        return userDao.getUserList();
    }

}
