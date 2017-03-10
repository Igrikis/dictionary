package com.project.vocabulary.dao;

import com.project.vocabulary.entity.Users;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
public interface UserDao {

    List<Users> getUserList();

    Users getUserByLogin(String login);

}
