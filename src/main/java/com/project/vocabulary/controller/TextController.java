package com.project.vocabulary.controller;

import com.project.vocabulary.api.ApiUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Igor Ivanov
 */

@Controller
public class TextController {

    @RequestMapping(value = ApiUrl.TEXT, method = RequestMethod.GET)
    public String loginPage() {
        return "text";
    }

}
