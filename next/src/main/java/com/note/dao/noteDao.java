package com.note.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.note.pojos.Note;

public interface noteDao extends JpaRepository<Note, Integer> {

}
