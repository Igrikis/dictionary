package com.project.vocabulary.security.impl;

import com.project.vocabulary.dto.UsersAuthDto;
import com.project.vocabulary.entity.Users;
import com.project.vocabulary.security.UserAuthService;
import com.project.vocabulary.service.AbstractService;
import com.project.vocabulary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Igor Ivanov
 */

@Service
public class UserAuthServiceImpl extends AbstractService implements UserAuthService{

    @Autowired
    private UserService userService;

    @Override
    public UsersAuthDto getUserByLogin(String login) {
        return userService.getUserByLogin(login);
    }

}
