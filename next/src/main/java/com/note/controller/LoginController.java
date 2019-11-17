package com.note.controller;


import java.util.List;
import java.util.Objects;

import org.apache.shiro.subject.Subject;

import org.apache.shiro.authc.AuthenticationException;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import com.note.pojos.AdminRole;
import com.note.pojos.User;
import com.note.result.Result;
import com.note.result.ResultFactory;
import com.note.service.AdminRoleMeunService;
import com.note.service.UserSevice;

@Controller
public class LoginController {
	
	@Autowired
	UserSevice userSevice;
	//登录
	@CrossOrigin
	@PostMapping(value = "/api/login")
	@ResponseBody
	public Result login(@RequestBody User requsertUser) {
		
		String username = requsertUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userSevice.get(username, requsertUser.getPassword());
        if (null == user) {
            return new Result(400);
        } else {
            return new Result(200);
        }

	
	}
	
	   
}
