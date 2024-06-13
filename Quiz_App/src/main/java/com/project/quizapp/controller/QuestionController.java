package com.project.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quizapp.model.Question;
import com.project.quizapp.service.QuestionService;

import io.swagger.v3.oas.annotations.tags.Tag;




@RestController
@RequestMapping("question")
@Tag( name= "Question Controller All CRUD operations",
      description="This is the class that Implements all the CRUD api related to Quiz management"
		)
public class QuestionController {
     
	@Autowired
	 private QuestionService questionService;
	
	@GetMapping("allQuestions")
	public ResponseEntity<List<Question>> getAllQuestions() {
		return questionService.getAllQuestions();
	}
	
	@GetMapping("category/{category}")
	public     ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
		return  questionService.getQuestionsByCategory(category);
	}
	
	@PostMapping("add")
	public ResponseEntity<String> addQuestion(@RequestBody Question question) {
	return questionService.addQuestion(question);	
	}
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteQuestionById(@PathVariable Integer id){
		return questionService.deleteQuestionById(id);
	}
	
}
