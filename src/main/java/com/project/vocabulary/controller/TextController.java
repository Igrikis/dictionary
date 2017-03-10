package com.project.vocabulary.controller;

import com.project.vocabulary.api.ApiUrl;
import com.project.vocabulary.dto.TextDto;
import com.project.vocabulary.dto.UsersDto;
import com.project.vocabulary.request.MultiResult;
import com.project.vocabulary.service.TextService;
import com.project.vocabulary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Igor Ivanov
 */

@Controller
public class TextController {

    @Autowired
    private TextService textService;

    @RequestMapping(value = ApiUrl.TEXT)
    public String textPage() {
        return "text";
    }

    @RequestMapping(value = ApiUrl.NEW_TEXT)
    public String newTextPage() {
        return "new_text";
    }

    @RequestMapping(value = ApiUrl.GET_TEXT, produces = ApiUrl.JSON)
    @ResponseBody
    public MultiResult<List<TextDto>> getText() {
        final List<TextDto> text = textService.getTextList();
        return new MultiResult<>(text, text.size());
    }

    @RequestMapping(value = ApiUrl.SAVE_TEXT)
    @ResponseBody
    public void saveText(
            TextDto data
    ) {
        textService.saveText(data);
    }

}
