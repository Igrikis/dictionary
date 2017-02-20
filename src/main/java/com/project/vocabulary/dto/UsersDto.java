package com.project.vocabulary.dto;

import com.project.vocabulary.dto.generic.AbstractDto;

/**
 * Created by Igor Ivanov
 */
public class UsersDto extends AbstractDto{

    private String login;
    private String firstName;
    private String lastName;
    private String email;

    public UsersDto() {
    }

    public UsersDto(String login, String firstName, String lastName, Long age, String email) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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
}