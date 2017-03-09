package com.project.vocabulary.controller;

import com.project.vocabulary.api.ApiUrl;
import com.project.vocabulary.dto.UsersDto;
import com.project.vocabulary.request.MultiResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Igor Ivanov
 */

@Controller
public class TextController {

    @RequestMapping(value = ApiUrl.TEXT, method = RequestMethod.GET)
    public String textPage() {
        return "text";
    }

    @RequestMapping(value = ApiUrl.NEW_TEXT, method = RequestMethod.GET)
    public String newTextPage() {
        return "new_text";
    }

    @RequestMapping(value = ApiUrl.ACCESS_DENIED, method = RequestMethod.POST)
    @ResponseBody
    public void saveText(String data) {
        data.toCharArray();

    }

}
