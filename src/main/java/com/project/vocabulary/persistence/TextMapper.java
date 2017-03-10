package com.project.vocabulary.persistence;

import com.project.vocabulary.entity.Text;

import java.util.List;

/**
 * Created by Igor Ivanov
 */
public interface TextMapper {

    List<Text> getTextList();

    void saveText(Text text);

}
