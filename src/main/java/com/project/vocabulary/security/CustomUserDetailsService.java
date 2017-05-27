package com.project.vocabulary.security;

import com.project.vocabulary.dto.UsersAuthDto;
import com.project.vocabulary.entity.UserRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igor Ivanov
 */

@Service("CustomUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    private static final String ROLE = "ROLE_";

    @Autowired
    private UserAuthService userAuthService;

    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String login)
            throws UsernameNotFoundException {

        UsersAuthDto user = userAuthService.getUserByLogin(login);

        if (user == null) {
            throw new UsernameNotFoundException("Username not found");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        for (UserRoles role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(String.format("%s%s", ROLE, role.getRole())));
        }

        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), authorities);
    }
}
