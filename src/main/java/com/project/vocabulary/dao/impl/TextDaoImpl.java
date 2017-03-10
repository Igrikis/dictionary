package com.project.vocabulary.dao.impl;

import com.project.vocabulary.dao.TextDao;
import com.project.vocabulary.entity.Text;
import com.project.vocabulary.persistence.TextMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
@Service
public class TextDaoImpl implements TextDao{

    @Autowired
    private TextMapper textMapper;

    @Override
    public List<Text> getTextList() {
        return textMapper.getTextList();
    }

    @Override
    public void saveText(Text text) {
        textMapper.saveText(text);
    }
}
