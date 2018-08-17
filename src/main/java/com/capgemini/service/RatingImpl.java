package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capgemini.model.Merchant;
import com.capgemini.model.Product;
import com.capgemini.repository.RatingRepository;

@Service(value = "rating")
public class RatingImpl implements Rating {
	@Autowired
	RatingRepository ratingRepository;

	public RatingImpl() {

	}

	public RatingImpl(RatingRepository ratingRepository2) {

	}

	public float setAvgRating(int pId) {

		List<Integer> id = ratingRepository.getFeedbackIds(pId);
		int sum = 0;
		for (int i : id) {
			int rating = ratingRepository.getFeedback(i);

			sum = sum + rating;
		}
		float avgRating = sum / id.size();
		Product product = ratingRepository.findProduct(pId);

		product.setAverageRating(avgRating);

		ratingRepository.save(product);
		return avgRating;

	}

	@Override
	public int getFb(int fId) {
		return ratingRepository.getFeedback(fId);
	}

	public float getAvgRating(int pId) {
		return ratingRepository.getProductAvgRating(pId);
	}

	@Override
	public float getMerchantAvgRating(int mId) {
		List<Integer> id = ratingRepository.getProductList(mId);
		float sum = 0;
		for (int i : id) {
			float avgRating = ratingRepository.getProductAvgRating(i);
			sum = sum + avgRating;
		}
		float avgRating = sum / id.size();
		Merchant merchant = ratingRepository.findMerchant(mId);
		merchant.setAverageRating(avgRating);
		ratingRepository.save(merchant);
		return avgRating;

	}

}
