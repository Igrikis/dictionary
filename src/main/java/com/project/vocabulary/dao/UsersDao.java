package com.project.vocabulary.dao;

import com.project.vocabulary.entity.Users;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * Created by Igor Ivanov on 07.03.2016.
 */
public interface UsersDao {

    List<Users> getUserList();

    Users getUserById(BigInteger id);

    Users getUserDetailById(Map<String, Object> params);

    int updateUserDetailsById(Map<String, Object> params);

    int updateUserEmailById(BigInteger id, String email);

    int deleteUserById(BigInteger id);

}
