package com.project.vocabulary.mapper.generic;

import com.project.vocabulary.util.ContextHandler;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import ma.glasnost.orika.metadata.ClassMapBuilder;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Igor Ivanov
 */

@Service("customMapper")
@DependsOn(value = {ContextHandler.BEAN_NAME})
public class ContextConfigurableOrikaMapper extends ConfigurableMapper implements IMapper{
    @Override
    @SuppressWarnings("unchecked")
    protected void configure(MapperFactory factory)
    {
        Map<String, ContextCustomMapper> customMappers = ContextHandler.getContext().getBeansOfType(ContextCustomMapper.class);
        for(ContextCustomMapper customMapper: customMappers.values())
        {
            Class fromTypeMap = customMapper.getAType().getRawType();
            Class toTypeMap = customMapper.getBType().getRawType();
            ClassMapBuilder builder = factory.classMap(fromTypeMap, toTypeMap).byDefault().customize(customMapper);
            builder.register();
        }
    }
}
