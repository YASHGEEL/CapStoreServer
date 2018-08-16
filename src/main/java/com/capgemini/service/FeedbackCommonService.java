package com.capgemini.service;

import java.util.List;

import com.capgemini.model.FeedBack;

public interface FeedbackCommonService {

	public FeedBack getComments(int id);
	
	public FeedBack postComments(FeedBack feedback);
	
	public FeedBack forwardToMerchant(int id);
	
	public FeedBack responseFromMerchant(int id);
	
	public List<FeedBack> displayAllFeedback();
	
	
	

}
