package com.note.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.note.interceptor.LoginInterceptor;

import ch.qos.logback.core.net.LoginAuthenticator;

@SpringBootConfiguration
public class WebConfigurer implements WebMvcConfigurer{
	
	@Bean 
	LoginInterceptor getLoginInterceptor() {
		return new LoginInterceptor();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//添加拦截器
		registry.addInterceptor(getLoginInterceptor()).addPathPatterns("/*=").excludePathPatterns("/index.html");
		
	}

}
