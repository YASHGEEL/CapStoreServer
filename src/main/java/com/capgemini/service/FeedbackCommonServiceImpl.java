package com.capgemini.service;

import java.util.ArrayList;
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
	public List<FeedBack> displayAllFeedback() {
		return repo.findAll();
	}

	@Override
	public List<List<FeedBack>> postMerchantComments(int merchantId) {
		
		List <Integer> productIdList = new ArrayList<>();
		List <List<FeedBack>> feedbackIdList = new ArrayList<>();
		
		productIdList=repo.getProductFromMerchantId(merchantId);
		
		for(Integer id:productIdList) {
			if(!repo.getFeedbackIdForThatProductId(id).isEmpty())
					feedbackIdList.add(repo.getFeedbackIdForThatProductId(id));
		}
		return feedbackIdList;
	}

	@Override
	public FeedBack reponseToCustomer(FeedBack feedback) {
		return repo.save(feedback);
	}

	
	
	
	


	
	
}  