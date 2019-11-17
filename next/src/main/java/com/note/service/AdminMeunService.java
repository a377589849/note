package com.note.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.note.dao.AdminMeunDao;
import com.note.pojos.AdminMeun;

@Service
public class AdminMeunService {
	@Autowired
	AdminMeunDao adminMeunDao;
	
	public AdminMeun getOneById(int id){
		return adminMeunDao.findById(id);
	}

}
