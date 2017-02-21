package com.project.vocabulary.entity;

import com.project.vocabulary.entity.generic.AbstractEntity;

/**
 * Created by Igor Ivanov
 */
public class UserRoles extends AbstractEntity {

    private String login;
    private String role;

    public UserRoles() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRoles userRoles = (UserRoles) o;

        if (login != null ? !login.equals(userRoles.login) : userRoles.login != null) return false;
        return role != null ? role.equals(userRoles.role) : userRoles.role == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
