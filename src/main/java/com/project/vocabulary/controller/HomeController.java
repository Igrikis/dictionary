package com.project.vocabulary.controller;

import com.project.vocabulary.dao.UsersDao;
import com.project.vocabulary.entity.Users;
import com.project.vocabulary.persistence.UsersMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Igor Ivanov on 06.03.2016.
 */

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UsersDao usersDao;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("subject", "world");
        List<Users> users = (usersDao.getUserList());
        return "Home";
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public void getUserById(@PathVariable(value = "id") BigInteger id) {
        Users user = usersDao.getUserById(id);
    }

    @RequestMapping(value = "/home/{id}", method = RequestMethod.GET)
    public void getUserDetailById(@PathVariable(value = "id") BigDecimal id,
                                  @RequestParam(value = "login", required = true) String login,
                                  @RequestParam(value = "firstName", required = true) String firstName) {
        Map params = new HashMap<String, Object>();
        params.put("id", id);
        params.put("login", login);
        params.put("firstName", firstName);
        Users user = usersDao.getUserDetailById(params);
    }

    @RequestMapping(value = "/home/{id}", method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable(value = "id") BigInteger id) {
        String str = usersDao.deleteUserById(id) == 1 ? "DELETE SUCCESS" : "DELETE FAILED";
    }

    @RequestMapping(value = "/home/{id}", method = RequestMethod.PUT)
    public void updateUserById(@PathVariable(value = "id") BigInteger id,
                               @RequestParam(value = "email", required = true) String email) {
        String str = usersDao.updateUserEmailById(id, email) == 1 ? "UPDATE SUCCESS" : "UPDATE FAILED";
    }

    @RequestMapping(value = "/home/update/{id}", method = RequestMethod.PUT)
    public void updateUserDetailById(@PathVariable(value = "id") BigInteger id,
                                     @RequestParam(value = "login", required = true) String login,
                                     @RequestParam(value = "email", required = false) String email) {
        Map params = new HashMap<String, Object>();
        params.put("id", id);
        if (email != null && email != "") {
            params.put("email", email);
        }
        params.put("nickname", login);
        String str = usersDao.updateUserDetailsById(params) == 1 ? "UPDATE SUCCESS" : "UPDATE FAILED";
    }
}
