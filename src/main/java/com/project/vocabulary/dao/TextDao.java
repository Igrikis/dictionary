package com.project.vocabulary.dao;

import com.project.vocabulary.entity.Text;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
public interface TextDao {

    List<Text> getTextList();

    void saveText(Text text);

}
