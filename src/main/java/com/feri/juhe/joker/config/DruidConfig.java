package com.feri.juhe.joker.config;

import com.alibaba.druid.support.http.StatViewFilter;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@program: Joker
 *@description:
 *@author: Feri
 *@create: 2019-08-06 15:02
 */
//@Configuration
public class DruidConfig {
    //注册Servlet
//    @Bean
//    @ConditionalOnMissingBean
    public ServletRegistrationBean addS(){
        ServletRegistrationBean registrationBean=new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        return registrationBean;
    }

    //注册Filter
//    @Bean
//    @ConditionalOnMissingBean
    public FilterRegistrationBean addF(){
        FilterRegistrationBean registrationBean=new FilterRegistrationBean(new StatViewFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
