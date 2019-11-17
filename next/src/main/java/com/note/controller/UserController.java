package com.note.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.note.dao.AdminDao;
import com.note.pojos.User;
import com.note.service.AdminService;
import com.note.service.UserSevice;

@Controller
public class UserController {
	@Autowired
	AdminService adminService;
	
	@GetMapping(value = "/api/users")
	@ResponseBody
	public List<User> list()throws Exception{
		return adminService.list();
	}
	
	@PostMapping("/api/user")
	public User addOrUpdata(@RequestBody User user)throws Exception{
		adminService.addAndUpdata(user);
		return user;
	}
	
	@PostMapping("/api/delete_user")
	public void delete(@RequestBody User user)throws Exception{
		adminService.deleteById(user.getID());
	}

}
