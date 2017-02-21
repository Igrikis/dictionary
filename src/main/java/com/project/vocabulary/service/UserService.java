package com.project.vocabulary.service;

import com.project.vocabulary.dto.UsersAuthDto;
import com.project.vocabulary.dto.UsersDto;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
public interface UserService {

    List<UsersDto> getUserList();

    UsersAuthDto getUserByLogin(String login);

}
