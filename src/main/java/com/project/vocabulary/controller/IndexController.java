package com.project.vocabulary.controller;

import com.project.vocabulary.api.ApiUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Igor Ivanov
 */
@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = ApiUrl.INDEX)
    public String indexPage() {
        return "index";
    }

    @RequestMapping(value = ApiUrl.LOGIN)
    public String loginPage() {
        return "login";
    }

}
