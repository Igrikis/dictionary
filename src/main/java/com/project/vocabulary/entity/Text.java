package com.project.vocabulary.entity;

import com.project.vocabulary.entity.generic.AbstractEntity;

import java.util.Date;

/**
 * Created by Igor Ivanov
 */
public class Text extends AbstractEntity{

    private Date date;
    private String label;
    private String englishText;
    private String russianText;

    public Text() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Text text = (Text) o;

        if (date != null ? !date.equals(text.date) : text.date != null) return false;
        if (label != null ? !label.equals(text.label) : text.label != null) return false;
        if (englishText != null ? !englishText.equals(text.englishText) : text.englishText != null) return false;
        return russianText != null ? russianText.equals(text.russianText) : text.russianText == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (englishText != null ? englishText.hashCode() : 0);
        result = 31 * result + (russianText != null ? russianText.hashCode() : 0);
        return result;
    }
}
