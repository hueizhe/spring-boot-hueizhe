package com.github.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

public class DatabaseConfiguration {
    private static Logger logger = LoggerFactory.getLogger(DatabaseConfiguration.class);


    @Primary
    @Bean(name= "dataSource")
    @ConfigurationProperties(prefix="spring.dataSource")
    public DataSource dataSource() {
        logger.debug("Configruing DataSource");
        return new DruidDataSource();
    }

}
