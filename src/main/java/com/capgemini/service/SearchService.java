package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.model.Product;

public interface SearchService {

	public List<Product> searchProductByName(String searchString);
	public List<Product> searchProductByBrand(String searchString);
	public List<Product> searchProductBycategory(String searchString);

	public Merchant searchMerchant(String searchString);

	public Customer searchCustomer(String sname);
	
	
	
}
