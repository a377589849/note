package com.note.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	 private int id;
	 private String password;
	 private String username;
	 private String salt;
	 private int role;
	 
	 @Transient
	 List<AdminMeun> adminMeuns;
	 
	 @Transient
	 List<AdminRole> meuns;
	 
	 
	 
	public List<AdminMeun> getAdminMeuns() {
		return adminMeuns;
	}
	public void setAdminMeuns(List<AdminMeun> adminMeuns) {
		this.adminMeuns = adminMeuns;
	}
	public List<AdminRole> getMeuns() {
		return meuns;
	}
	public void setMeuns(List<AdminRole> meuns) {
		this.meuns = meuns;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getID() {
		return id;
	}
	public void setID(int iD) {
		id = iD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	 
	 

}
