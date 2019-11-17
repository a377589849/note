package com.note.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.note.pojos.Note;
import com.note.pojos.User;

public interface AdminDao  extends JpaRepository<User,Integer>{
}
