package com.capgemini.service;

import java.util.List;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.Category;
import com.capgemini.model.Product;

public interface SortService {

	//for filtering products
	public List<Product> viewProductsInRange(int category, float minPrice, float maxPrice) throws ProductNotFoundException, CategoryNotFoundException;
	
	//for sorting products
	public List<Product> sortProductsByPriceAscending(int category) throws CategoryNotFoundException;
	public List<Product> sortProductsByPriceDescending(int category)throws CategoryNotFoundException;
	
	
	public List<Product> sortProductsByViewCountDescending(int category)throws CategoryNotFoundException;
	
	public List<Product> sortProductsByRatingsDescending(int category) throws CategoryNotFoundException;
}
