package com.project.quizapp.dao;


import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.project.quizapp.model.Question;

@Repository
@RepositoryRestResource
public interface QuestionDao extends JpaRepository<Question,Integer>{
	
	List<Question> findByCategory(String category);

	@Query(value= "select * from question q where q.category=:category order by  random() LIMIT :numQ ",nativeQuery=true)
	List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
