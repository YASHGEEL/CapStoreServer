package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capgemini.model.FeedBack;
import com.capgemini.model.Merchant;
import com.capgemini.model.Product;
import com.capgemini.repository.RatingRepository;
import com.capgemini.repository.UserRepository;

@Service(value = "rating")
public class RatingImpl implements Rating {
	@Autowired
	RatingRepository ratingRepository;

	public RatingImpl() {

	}

	public float setAvgRating(int pId) {

		List<Integer> id = ratingRepository.getFeedbackIds(pId);
		int sum=0;
		for (int i : id) {
			int rating = ratingRepository.getFeedback(i);
			//Optional<FeedBack> feedback  = ratingRepository.getFeedback(id1);
			sum = sum+ rating;
			
		}
		
		return sum/id.size();

	}

	@Override
	public int getFb(int pId) {

		return ratingRepository.getFeedback(pId);

	}

	

	@Override
	public List<Product> getProductList(int mId) {
		// TODO Auto-generated method stub
		return null;
	}

}
