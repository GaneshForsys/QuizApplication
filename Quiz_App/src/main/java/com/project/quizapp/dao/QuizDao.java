package com.project.quizapp.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


import com.project.quizapp.model.Quiz;

@Repository
@RepositoryRestResource
public interface QuizDao extends JpaRepository<Quiz, Integer> {
	
	

}
