package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.capgemini.model.FeedBack;
import com.capgemini.repository.FeedbackCommonRepository;

@Component  
public class FeedbackCommonServiceImpl implements FeedbackCommonService{


	@Autowired
	FeedbackCommonRepository repo;

	@Override
	public FeedBack getComments(int id) {
	   return repo.getComments(id);
	}
	
	@Override
	public FeedBack postComments(FeedBack feddback) {
		return repo.save(feddback);
	}

	@Override
	public FeedBack forwardToMerchant(int feedbackId) {
		return null;
	}

	@Override
	public FeedBack responseFromMerchant(int feedbackId) {
		return null;
	}

	@Override
	public List<FeedBack> displayAllFeedback() {
		return null;
	}

	
	
	
	
	


	
	
}  