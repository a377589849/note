package com.note.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.note.pojos.AdminMeun;
import com.note.pojos.AdminRoleMenu;
import com.note.pojos.AdminUserRole;
import com.note.pojos.User;
import com.note.service.AdminMeunService;
import com.note.service.AdminRoleMeunService;
import com.note.service.AdminUserRoleService;
import com.note.service.UserSevice;

@RestController
public class MeunController {
	@Autowired
	UserSevice userSevice;
	@Autowired
	AdminUserRoleService adminUserRoleService;
	@Autowired
	AdminRoleMeunService adminRoleMeunService;
	@Autowired
	AdminMeunService adminMeunService;
	
	@GetMapping("/api/menu")
	public List<AdminMeun>menu(){
		return getMenuByRole();
	}
	
	public List<AdminMeun> getMenuByRole(){
		String username=SecurityUtils.getSubject().getPrincipal().toString();
		User user=userSevice.getByName(username);
		System.out.println(user.getUsername());
		List<AdminUserRole> userRolesList=adminUserRoleService.listAllByUid(user.getID());
		List<AdminMeun> menus=new ArrayList<AdminMeun>();
		for(AdminUserRole userRole:userRolesList) {
			List<AdminRoleMenu> roleMenuList=adminRoleMeunService.listAllById(userRole.getRid());
			for(AdminRoleMenu roleMenu:roleMenuList) {
				menus.add(adminMeunService.getOneById(roleMenu.getMid()));
			}
		}
		
		return menus;
	}

}
