package com.capgemini.service;

import com.capgemini.model.FeedBack;

public interface UserFeedBackService {
	public FeedBack getFeedback(String comment,int rating);
	

}
