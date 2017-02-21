package com.project.vocabulary.dao.impl;

import com.project.vocabulary.dao.UserDao;
import com.project.vocabulary.entity.Users;
import com.project.vocabulary.persistence.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * Created by Igor Ivanov
 */
@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    private UsersMapper usersMapper;

    public List<Users> getUserList() {
        return usersMapper.getUserList();
    }

    @Override
    public Users getUserByLogin(String login) {
        return usersMapper.getUserByLogin(login);
    }

}
