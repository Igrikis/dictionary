package com.project.vocabulary.dto;

import com.project.vocabulary.dto.generic.AbstractDto;

import java.util.Date;

/**
 * Created by Igor Ivanov
 */
public class TextDto extends AbstractDto{

    private Date date;
    private String label;
    private String englishText;
    private String russianText;

    public TextDto() {
    }

    public TextDto(Date date, String label, String englishText, String russianText) {
        this.date = date;
        this.label = label;
        this.englishText = englishText;
        this.russianText = russianText;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getEnglishText() {
        return englishText;
    }

    public void setEnglishText(String englishText) {
        this.englishText = englishText;
    }

    public String getRussianText() {
        return russianText;
    }

    public void setRussianText(String russianText) {
        this.russianText = russianText;
    }
}
