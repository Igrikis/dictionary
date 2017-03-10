package com.project.vocabulary.mapper;

import com.project.vocabulary.dto.TextDto;
import com.project.vocabulary.entity.Text;
import com.project.vocabulary.mapper.generic.ContextCustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

/**
 * Created by Igor Ivanov
 */
@Service
public class TextOricaMapper extends ContextCustomMapper<Text, TextDto> {

    @Override
    public void mapAtoB(Text text, TextDto textDto, MappingContext context) {
        textDto.setDate(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(text.getDate()));
    }

}
