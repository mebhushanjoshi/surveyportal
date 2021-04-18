package com.cg.surveyportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.surveyportal.entities.Feedback;
import com.cg.surveyportal.exceptions.FeedbackNotFoundException;
import com.cg.surveyportal.exceptions.ParticipantNotFoundException;
import com.cg.surveyportal.exceptions.SurveyNotFoundException;
import com.cg.surveyportal.services.IFeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	IFeedbackService feedbackService; 
	
//	@GetMapping("/populate")
//	private void populate() throws ParticipantNotFoundException, SurveyNotFoundException
//	{
//		feedbackService.populateFeedback();
//	}
	
	@GetMapping("/all")
	private List<Feedback> getAll()
	{
		return feedbackService.getAll();
	}
	
	@GetMapping("/findById/{id}")
	private Feedback getfindById(@PathVariable("id") long id) throws FeedbackNotFoundException
	{
		return feedbackService.getById(id);
	}
	@DeleteMapping("/removeById/{removeId}")
	private Feedback removeById(@PathVariable("removeId") long removeId)
	{
		return feedbackService.removeById(removeId);
	}
	
	@PostMapping("/addFeedback/{participantId}/{surveyId}/{questionId}/{option}")
	private void addFeedbackText(@PathVariable("participantId") long participantId, @PathVariable("surveyId") long surveyId, @PathVariable("questionId") long questionId, @PathVariable("option") String option) throws ParticipantNotFoundException, SurveyNotFoundException
	{
		feedbackService.addFeedback( participantId, surveyId, questionId, option);
	}
}
