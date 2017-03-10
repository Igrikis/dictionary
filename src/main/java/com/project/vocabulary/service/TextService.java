package com.project.vocabulary.service;

import com.project.vocabulary.dto.TextDto;
import com.project.vocabulary.entity.Text;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
public interface TextService {

    List<TextDto> getTextList();

    void saveText(Text text);

}
