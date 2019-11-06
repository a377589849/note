package com.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.note.dao.UserDao;
import com.note.pojos.User;

@Service
public class UserSevice {

	@Autowired
	UserDao userDao;
	
	public boolean isExist(String username) {
		User user=getByName(username);
		return null!=user;
	}
	
	public User getByName(String Name) {
		return userDao.findByUsername(Name);
	}
	public User get(String username,String password) {
		return userDao.getByUsernameAndPassword(username, password);
	}
	public void add(User user) {
		userDao.save(user);
	}

}
