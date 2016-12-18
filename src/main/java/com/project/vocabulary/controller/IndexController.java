package com.project.vocabulary.controller;

import com.project.vocabulary.api.ApiUrl;
import com.project.vocabulary.dao.UserDao;
import com.project.vocabulary.entity.Users;
import com.project.vocabulary.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = ApiUrl.INDEX, method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("subject", "world");
        List<Users> users = (userService.getUserList());
        return "Home";
    }

}
