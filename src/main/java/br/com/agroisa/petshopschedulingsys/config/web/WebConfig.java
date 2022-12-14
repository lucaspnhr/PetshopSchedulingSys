package br.com.agroisa.petshopschedulingsys.config.web;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/","/home");
        registry.addViewController("/home").setViewName("index");
        WebMvcConfigurer.super.addViewControllers(registry);
    }



    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
