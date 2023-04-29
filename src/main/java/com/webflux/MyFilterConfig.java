package com.webflux;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
@RequiredArgsConstructor
public class MyFilterConfig {

    private final EventNotify eventNotify;


    @Bean
    public FilterRegistrationBean<Filter> addFilter() {
        System.out.println("필터 등록됨");
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>(new MyFilter(eventNotify));
        bean.addUrlPatterns("/sse");
        return bean;
    }

    @Bean
    public FilterRegistrationBean<Filter> addFilter2() {
        System.out.println("필터 등록됨");
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>(new MyFilter2(eventNotify));
        bean.addUrlPatterns("/add");
        return bean;
    }
}
