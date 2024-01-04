package com.data.rest.config;

import com.data.rest.entity.Employee;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class DataRestCustomization implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] methods={HttpMethod.DELETE,HttpMethod.PUT};
        config.getExposureConfiguration()
                .forDomainType(Employee.class)
                .withItemExposure((metadata,http)->http.disable(methods));
    }
}