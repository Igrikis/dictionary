package com.project.vocabulary.controller;

import com.project.vocabulary.api.ApiUrl;
import com.project.vocabulary.dto.UsersDto;
import com.project.vocabulary.request.MultiResult;
import com.project.vocabulary.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = ApiUrl.INDEX, produces = ApiUrl.JSON)
    @ResponseBody
    public MultiResult<List<UsersDto>> indexPage() {
        final List<UsersDto> users = userService.getUserList();
        logger.debug("Users " + users);
        return new MultiResult<>(users, users.size());
    }

}
