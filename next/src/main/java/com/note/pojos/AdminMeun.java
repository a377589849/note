package com.note.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="admin_meun")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class AdminMeun {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	String path;
    String icon;
    String component;
    @Column(name = "parent_id")
    String parentId;

    @Transient
	List<AdminMeun> children;
	@Transient
	MenuMeta menuMeta;

	
	public List<AdminMeun> getChildren() {
		return children;
	}

	public void setChildren(List<AdminMeun> children) {
		this.children = children;
	}

	public MenuMeta getMenuMeta() {
		return menuMeta;
	}

	public void setMenuMeta(MenuMeta menuMeta) {
		this.menuMeta = menuMeta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	
	

}
