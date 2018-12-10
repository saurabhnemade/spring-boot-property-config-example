package com.saurabhnemade.springbootpropertyconfigexample.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PropertiesConfiguration {


    @Bean
    public PropertyPlaceholderConfigurer properties() {
        final PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
        propertyPlaceholderConfigurer.setIgnoreResourceNotFound(true);

        final List<Resource> resourceLst = new ArrayList<Resource>();

        resourceLst.add(new ClassPathResource("application.properties"));
        resourceLst.add(new ClassPathResource("another.properties"));
        //resourceLst.add(new FileSystemResource("/etc/myapp/overriding.propertie")); to load the properties from file
        resourceLst.add(new ClassPathResource("another-2.properties"));
        propertyPlaceholderConfigurer.setLocations(resourceLst.toArray(new Resource[]{}));

        return propertyPlaceholderConfigurer;
    }
}