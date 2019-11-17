package com.note.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.note.pojos.AdminMeun;

public interface AdminMeunDao extends JpaRepository<AdminMeun, Integer>{
	
	public AdminMeun findById(int id);

}
