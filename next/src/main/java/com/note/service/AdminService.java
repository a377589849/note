package com.note.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.note.dao.AdminDao;
import com.note.pojos.User;
@Service
public class AdminService {
	@Autowired
	AdminDao adminDao;
	public void deleteById(int id ) {
		adminDao.deleteById(id);
	}
	public void addAndUpdata(User user) {
		adminDao.save(user);
	}
	public List<User> list(){
		Sort sort=new Sort(Sort.Direction.DESC,"id");
		return adminDao.findAll(sort);
	}

}
