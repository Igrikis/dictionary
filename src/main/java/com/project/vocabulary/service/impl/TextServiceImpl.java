package com.project.vocabulary.service.impl;

import com.project.vocabulary.dao.TextDao;
import com.project.vocabulary.dto.TextDto;
import com.project.vocabulary.entity.Text;
import com.project.vocabulary.service.AbstractService;
import com.project.vocabulary.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Igor Ivanov
 */
@Service
public class TextServiceImpl extends AbstractService implements TextService{

    @Autowired
    private TextDao textDao;

    @Override
    public List<TextDto> getTextList() {
        return mapper.mapAsList(textDao.getTextList(), TextDto.class);
    }

    @Override
    public void saveText(TextDto text) {
        Text item = mapper.map(text, Text.class);
        item.setDate(new Date());
        textDao.saveText(item);
    }
}
