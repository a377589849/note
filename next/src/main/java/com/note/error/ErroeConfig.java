package com.note.error;

import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ErroeConfig implements ErrorPageRegistrar{
	
	
	@Override
	public void registerErrorPages(ErrorPageRegistry registry) {
		// TODO Auto-generated method stub
		ErrorPage error404Page=new ErrorPage(HttpStatus.NOT_FOUND,"/");
		registry.addErrorPages(error404Page);
	}

}
