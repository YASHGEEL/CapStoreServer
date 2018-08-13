package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.model.Product;
import com.capgemini.repository.UserRepository;  
@Service  
public interface UserService {
	public int setRatingOfProduct(int rating);
	public Product updateAverageRating(Product product);
	public Merchant updateMerchantRating(Merchant merchant); 
	
	


}  