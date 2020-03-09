package com.spring.controller;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//@EnableWebMvc
//@Configuration
public class Configuration implements WebMvcConfigurer {
//	@Bean
//	public ViewResolver viewResolver() {
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		viewResolver.setViewClass(JstlView.class);
//		viewResolver.setPrefix("/WEB-INF/views/");
//		viewResolver.setSuffix(".jsp");
//		System.out.println("khoi tao viewresolver");
//		return viewResolver;
//	}
//	// can annotation EnableWebMvc
//	@Bean
//	public MessageSource messageSource() {
//		ReloadableResourceBundleMessageSource bun = new ReloadableResourceBundleMessageSource();
//		bun.setBasename("classpath:messages");
//		bun.setDefaultEncoding("utf-8");
//		bun.setCacheSeconds(10);
//		messageSource.setBasenames("messages", "i18n/messages");
//      messageSource.setDefaultEncoding(Charset.forName("UTF-8").name());
//   	messageSource.setFallbackToSystemLocale(true);
// 	   	messageSource.setCacheSeconds(-1);
//  	messageSource.setAlwaysUseMessageFormat(false);
//    	messageSource.setUseCodeAsDefaultMessage(true);
//		return bun;
//	}
	
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/static/**").addResourceLocations("/storage/");
//	}
//	// upload file
//	@Bean
//	public MultipartResolver multipartResolver() {
//		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
//		// -1 = unlimited
//		commonsMultipartResolver.setMaxUploadSize(-1);
//		return commonsMultipartResolver;
//	}
}
