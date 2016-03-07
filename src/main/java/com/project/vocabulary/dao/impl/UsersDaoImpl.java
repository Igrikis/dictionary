package com.project.vocabulary.dao.impl;

import com.project.vocabulary.dao.UsersDao;
import com.project.vocabulary.entity.Users;
import com.project.vocabulary.persistence.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@Service
public class UsersDaoImpl implements UsersDao{

    @Autowired
    private UsersMapper usersMapper;

    public List<Users> getUserList() {
        return usersMapper.getUserList();
    }

    public Users getUserById(BigInteger id) {
        return usersMapper.getUserById(id);
    }

    public Users getUserDetailById(Map<String, Object> params) {
        return usersMapper.getUserDetailById(params);
    }

    public int updateUserDetailsById(Map<String, Object> params) {
        return usersMapper.updateUserDetailsById(params);
    }

    public int updateUserEmailById(BigInteger id, String email) {
        return usersMapper.updateUserEmailById(id, email);
    }

    public int deleteUserById(BigInteger id) {
        return usersMapper.deleteUserById(id);
    }
}
