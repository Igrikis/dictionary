package com.project.vocabulary.controller;

import com.project.vocabulary.api.ApiUrl;
import com.project.vocabulary.dto.TextDto;
import com.project.vocabulary.request.MultiResult;
import com.project.vocabulary.service.TextService;
import com.project.vocabulary.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Igor Ivanov
 */

@RestController
public class TextController {

    @Autowired
    private TextService textService;

    @RequestMapping(value = ApiUrl.TEXT)
    public String textPage() {
        return null;
    }

    @RequestMapping(value = ApiUrl.NEW_TEXT)
    public String newTextPage() {
        return null;
    }

    @RequestMapping(value = ApiUrl.GET_TEXT, produces = Constants.JSON)
    public MultiResult<List<TextDto>> getText() {
        final List<TextDto> text = textService.getTextList();
        return new MultiResult<>(text, text.size());
    }

    @RequestMapping(value = ApiUrl.SAVE_TEXT)
    public void saveText(TextDto data) {
        textService.saveText(data);
    }

}
