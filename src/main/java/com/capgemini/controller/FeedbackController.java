package com.capgemini.controller;

import java.util.List;

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
	
	//to get particular comment
	@RequestMapping(value="/getcomment")
	public FeedBack getCommentsFromCustomer(int id) {
		return service.getComments(id);
	}
	
	//to display all comments in admin page
	@RequestMapping(value="/allcomments",method=RequestMethod.POST)
	public List<FeedBack> postAllcomments(@RequestBody FeedBack feedback){
		return service.displayAllFeedback();
		
	}
	
	//to provide the comments for the merchat in the merchant page
	@RequestMapping(value="/merchantcomment",method=RequestMethod.POST)
	public List<List<FeedBack>> postMerchantComments(int id){
		return service.postMerchantComments(id);
	}
	
	// to give response to the customer for the comment
	@RequestMapping(value="/response",method=RequestMethod.POST)
	public FeedBack responseToCustomer(FeedBack feedback) {
		return service.reponseToCustomer(feedback);
	}
	
	
}
