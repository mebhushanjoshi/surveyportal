package com.cg.surveyportal.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.surveyportal.exceptions.InvalidQuestionTextException;
import com.cg.surveyportal.exceptions.InvalidSurveyException;
import com.cg.surveyportal.exceptions.QuestionNotFoundException;
import com.cg.surveyportal.exceptions.SurveyNotFoundException;

import com.cg.surveyportal.entities.Question;
import com.cg.surveyportal.services.IQuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	IQuestionService questionService;
//	
//	@GetMapping("/populate")
//	private void populate()
//	{
//		questionService.populate();
//	}
	@GetMapping("/all")
	private List<Question> getQuestionDetails(){
		return questionService.getQuestionDetails();
	}
	
	@GetMapping("/findById/{id}")
	private Question getfindById(@PathVariable("id") long id) throws QuestionNotFoundException{
		return questionService.getById(id);
	}
	
	@PutMapping("/update/{id}/{updatetext}")
	private Question updateQuestion(@PathVariable("id") long id, @PathVariable("updatetext") String updatetext) throws InvalidQuestionTextException, SurveyNotFoundException, InvalidSurveyException{
		return questionService.updateQuestion(id, updatetext);
	}
	
	@DeleteMapping("/remove/{removeId}")
	private Question removeById(@PathVariable("removeId") long removeId){
		return questionService.removeById(removeId);
	}
	
	@PostMapping("/add/{questionText}/{surveyId}")
	private void addQuestion(@PathVariable("questionText") String questionText, @PathVariable("surveyId") long surveyId) throws SurveyNotFoundException{
		questionService.addQuestion(questionText, surveyId);
	}
}