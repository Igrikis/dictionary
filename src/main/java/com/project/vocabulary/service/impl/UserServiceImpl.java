package com.project.vocabulary.service.impl;

import com.project.vocabulary.dao.UserDao;
import com.project.vocabulary.dto.UsersDto;
import com.project.vocabulary.service.AbstractService;
import com.project.vocabulary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
@Service
public class UserServiceImpl extends AbstractService implements UserService{

    @Autowired
    private UserDao userDao;

    public List<UsersDto> getUserList() {
        return mapper.mapAsList(userDao.getUserList(), UsersDto.class);
    }

    @Override
    public UsersDto getUserByLogin(String login) {
        return mapper.map(userDao.getUserByLogin(login), UsersDto.class);
    }

}
