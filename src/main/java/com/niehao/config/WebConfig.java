package com.niehao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName: WebConfig
 * Package: com.niehao.config
 * Description:
 *
 * @Author NieHao
 * @Create 2023/9/5 21:04
 * @Version 1.0
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/bossmain.html").setViewName("main");
        //boss 端
        registry.addViewController("/boss/addEmp.html").setViewName("boss/addEmp");
        registry.addViewController("/boss/listEmp.html").setViewName("boss/listEmp");
        registry.addViewController("/logout").setViewName("login");
    }
}
