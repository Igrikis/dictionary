package com.project.vocabulary.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Igor Ivanov
 */
@Component("contextHandler")
public class ContextHandler implements ApplicationContextAware {

    public static final String BEAN_NAME = "contextHandler";

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        ContextHandler.context = context;
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
