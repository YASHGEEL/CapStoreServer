package com.capgemini.service;

import org.springframework.stereotype.Service;

import com.capgemini.model.Merchant;
import com.capgemini.model.Product;

@Service
public interface Rating {
	public int setRatingOfProduct(int rating);

	public Product updateAverageRating(Product product);

	public Merchant updateMerchantRating(Merchant merchant);
	

}
