package com.zhishinews.diplomaproject.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {
    /**
     * 配置静态访问资源
     * @param registry
     */
    @Override
    public void  addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/pictures/**").addResourceLocations("classpath:/static/pictures/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/bootstrap-4.4.1-dist/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/bootstrap-4.4.1-dist/js/");
    }
}
