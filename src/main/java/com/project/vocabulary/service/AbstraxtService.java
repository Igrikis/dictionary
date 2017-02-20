package com.project.vocabulary.service;

import com.project.vocabulary.mapper.generic.IMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Igor Ivanov
 */
public class AbstraxtService {
    @Autowired
    protected IMapper mapper;
}
