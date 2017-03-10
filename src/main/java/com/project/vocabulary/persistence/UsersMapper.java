package com.project.vocabulary.persistence;

import com.project.vocabulary.entity.Users;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
public interface UsersMapper {

    List<Users> getUserList();

    Users getUserByLogin(String login);

}
