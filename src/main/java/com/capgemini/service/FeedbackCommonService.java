package com.capgemini.service;

import java.util.List;

import com.capgemini.model.FeedBack;

public interface FeedbackCommonService {

	// to get particular comment
	public FeedBack getComments(int id);
	
	//to display all comments in the admin page
	public List<FeedBack> displayAllFeedback();
	
	//to post all the merchant comments	
	public List<List<FeedBack>> postMerchantComments(int merchantId);
	
	//to give response
	public FeedBack reponseToCustomer(FeedBack feedback);
	

}
