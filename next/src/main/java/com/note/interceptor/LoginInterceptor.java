package com.note.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import com.note.pojos.User;

public class LoginInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,Object o)throws Exception {
		HttpSession session=httpServletRequest.getSession();
		String contextPath=session.getServletContext().getContextPath();
		String[] requireAuthPage=new String[] {
				"index",
		};
		String uri =httpServletRequest.getRequestURI();
		 uri=StringUtils.remove(uri, contextPath+"/");
		 String page=uri;
		 
		 if (begingWith(page,requireAuthPage)) {
			 User user=(User)session.getAttribute("user");
			 if(user==null) {
				 httpServletResponse.sendRedirect("login");
				 return false;
			 }
			
		}
		return true;
	}
	
	private boolean begingWith(String page,String[] requiredAuthPages) {
		boolean result=false;
		for(String requiredAuthPage:requiredAuthPages) {
			if(StringUtils.startsWith(page, requiredAuthPage)) {
				result=true;
				break;
			}
		}
		return result;
	}

}
