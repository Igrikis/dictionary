package com.project.vocabulary.security;

import com.project.vocabulary.entity.Users;

/**
 * Created by Igor Ivanov
 */
public interface UserAuthService {

    Users getUserByLogin(String login);

}
