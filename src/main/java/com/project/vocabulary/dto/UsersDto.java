package com.project.vocabulary.dto;

import com.project.vocabulary.dto.generic.AbstractDto;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
public class UsersDto extends AbstractDto{

    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<String> roles;

    public UsersDto() {
    }

    public UsersDto(String login, String firstName, String lastName, String email, String password, List<String> roles) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
