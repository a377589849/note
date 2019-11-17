package com.note.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.note.dao.noteDao;
import com.note.pojos.Note;
@Service
public class noteService {
	@Autowired
	noteDao notedao;
	
	public List<Note> list(){
		Sort sort=new Sort(Sort.Direction.DESC,"noteid");
		return notedao.findAll(sort);
	}
	
	public void addAndUpdata(Note note) {
		notedao.save(note);
	}
	public void deleteById(int id) {
		notedao.deleteById(id);
	}
	

}
