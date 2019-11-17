package com.note.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.note.pojos.AdminUserRole;

public interface AdminUserRoleDAO extends JpaRepository<AdminUserRole, InternalError> {

	List<AdminUserRole> findAllByUid(int uid);
}
