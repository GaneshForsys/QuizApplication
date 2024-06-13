package com.project.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizapp.model.users;

public interface UsersDao extends JpaRepository<users, Integer> {
	
	users findByUsername (String username);

}
