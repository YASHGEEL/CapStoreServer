package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.FeedBack;
import com.capgemini.service.FeedbackCommonService;

@RestController
public class FeedbackController {

	@Autowired 
	FeedbackCommonService service;
	
	@RequestMapping(value="/getcomment")
	public FeedBack getCommentsFromCustomer(int id) {
		
		return service.getComments(id);
	}
	
	@RequestMapping(value="/postcomment",method=RequestMethod.POST)
	public FeedBack getCommentsFromCustome1r(@RequestBody FeedBack feedback) {
		
		return service.postComments(feedback);
	}
	
	
}
