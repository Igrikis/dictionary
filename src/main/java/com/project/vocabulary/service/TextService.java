package com.project.vocabulary.service;

import com.project.vocabulary.dto.TextDto;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
public interface TextService {

    List<TextDto> getTextList();

    void saveText(TextDto text);

}
