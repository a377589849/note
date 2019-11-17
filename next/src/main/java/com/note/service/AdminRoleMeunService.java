package com.note.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.note.dao.AdminRoleMeunDao;
import com.note.pojos.AdminRole;
import com.note.pojos.AdminRoleMenu;


@Service
public class AdminRoleMeunService {
	@Autowired
	AdminRoleMeunDao meunDao;
	
	public List<AdminRoleMenu> listAllById(int rid){
		return meunDao.findAllByRid(rid);
		
		
	}
	
	

}
