package com.project.vocabulary.dao;

import com.project.vocabulary.entity.Users;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * Created by Igor Ivanov
 */
public interface UserDao {

    List<Users> getUserList();

    Users getUserByLogin(String login);

}
