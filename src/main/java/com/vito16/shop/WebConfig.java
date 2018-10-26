package com.vito16.shop;

import com.vito16.shop.common.web.AdminAuthenticationInterceptor;
import com.vito16.shop.common.web.AuthenticationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author 周欣文
 * @version 2018/10/19
 */
@Configuration
@EnableSpringDataWebSupport
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthenticationInterceptor()).addPathPatterns(
                "/user/*","/order/*","/cart/*"
        ).excludePathPatterns("/user/login","/user/reg","/user/logout");

        registry.addInterceptor(new AdminAuthenticationInterceptor()).addPathPatterns(
                "/admin/*","/*/admin/*"
        ).excludePathPatterns("/admin/login","/admin/logout");
    }

    @Bean(name = "multipartResolver")
    public StandardServletMultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }

}
