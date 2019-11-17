package com.note.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "note")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Note {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name ="noteid")
	 private int noteid;
	
	 private String notename;
	 private String Pic;
	 private String text;
	public int getNoteId() {
		return noteid;
	}
	public void setNoteId(int noteId) {
		this.noteid = noteId;
	}
	public String getNoteName() {
		return notename;
	}
	public void setNoteName(String noteName) {
		this.notename = noteName;
	}
	public String getPic() {
		return Pic;
	}
	public void setPic(String pic) {
		Pic = pic;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	 
	 
	
	 

}
