package com.note.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.note.pojos.AdminRole;
import com.note.pojos.User;

public interface UserDao extends JpaRepository<User,Integer>{
	
	User findByUsername(String username);
	
	User getByUsernameAndPassword(String username,String password);
	
	

	

}
