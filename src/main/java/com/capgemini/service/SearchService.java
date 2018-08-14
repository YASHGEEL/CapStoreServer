package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.model.Product;

public interface SearchService {

	public List<Product> searchProducts(String searchString);

	public List<Merchant> searchMerchant(String searchString);

	public List<Customer> searchCustomer(String searchString);
	
	
	
}
