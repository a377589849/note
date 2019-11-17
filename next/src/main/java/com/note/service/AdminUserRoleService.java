package com.note.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.note.dao.AdminUserRoleDAO;
import com.note.pojos.AdminUserRole;

@Service
public class AdminUserRoleService {
	@Autowired
	AdminUserRoleDAO adminUserRoleDAO;
	
	public List<AdminUserRole> listAllByUid(int uid){
		return adminUserRoleDAO.findAllByUid(uid);
	}

}
