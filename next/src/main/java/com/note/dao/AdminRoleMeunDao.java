package com.note.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.note.pojos.AdminRole;
import com.note.pojos.AdminRoleMenu;

public interface AdminRoleMeunDao extends JpaRepository<AdminRoleMenu, Integer> {

	public List<AdminRoleMenu> findAllByRid(int rid);
}
