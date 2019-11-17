package com.note.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.note.dao.noteDao;
import com.note.pojos.Note;
import com.note.service.noteService;

@Controller
public class NoteController {
	@Autowired
	noteService nService;
	
	@GetMapping(value = "/api/notes")
	@ResponseBody
	public List<Note> list()throws Exception{
		return nService.list();
	}
	
	@PostMapping("/api/note")
	public Note addOrUpdata(@RequestBody Note note)throws Exception{
		nService.addAndUpdata(note);
		return note;
	}
	
	@PostMapping("/api/delete")
	public void delete(@RequestBody Note note)throws Exception{
		nService.deleteById(note.getNoteId());
	}
	
	

}
