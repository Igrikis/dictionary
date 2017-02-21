package com.project.vocabulary.security;

import com.project.vocabulary.dto.UsersAuthDto;

/**
 * Created by Igor Ivanov
 */
public interface UserAuthService {

    UsersAuthDto getUserByLogin(String login);

}
