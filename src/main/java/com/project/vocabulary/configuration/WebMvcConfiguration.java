package com.project.vocabulary.configuration;

import liquibase.integration.spring.SpringLiquibase;
import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Igor Ivanov
 */
@Configuration
@ComponentScan("com.project.vocabulary")
@MapperScan("com.project.vocabulary.persistence")
@PropertySource("classpath:config/application.properties")
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.clear.database.url}")
    private String clearDataBase;
    @Value("${jdbc.database.url}")
    private String dataBase;
    @Value("${jdbc.unicode}")
    private String unicode;

    @Bean
    public static PropertySourcesPlaceholderConfigurer config() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public BasicDataSource getDataSource() throws URISyntaxException {
        URI dbUri;
        BasicDataSource basicDataSource = new BasicDataSource();

        if (System.getenv(clearDataBase) != null) {
            dbUri = new URI(System.getenv(clearDataBase));
            basicDataSource.setUrl(String.format("%s%s%s", url, dbUri.getHost(), dbUri.getPath()));
        } else {
            dbUri = new URI(System.getenv(dataBase));
            basicDataSource.setUrl(String.format("%s%s:%d%s", url, dbUri.getHost(), dbUri.getPort(), dbUri.getPath()));
            basicDataSource.setDriverClassName(driverClassName);
        }

        basicDataSource.setConnectionProperties(unicode);
        basicDataSource.setUsername(dbUri.getUserInfo().split(":")[0]);
        basicDataSource.setPassword(dbUri.getUserInfo().split(":")[1]);

        return basicDataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() throws URISyntaxException {
        return new DataSourceTransactionManager(getDataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());
        return sessionFactory;
    }

    @Bean
    public SpringLiquibase liquibase() throws URISyntaxException {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(getDataSource());
        liquibase.setChangeLog("classpath:liquibase/db-changelog.xml");
        liquibase.setContexts("test, production");
        return liquibase;
    }
}
