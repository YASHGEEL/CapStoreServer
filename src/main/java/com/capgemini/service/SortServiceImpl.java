package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.Product;
import com.capgemini.repository.SortRepository;


@Service("service")
public class SortServiceImpl implements SortService{
	@Autowired
	SortRepository repo;

	@Override
	public List<Product> viewProductsInRange(int category_id, float minPrice, float maxPrice)
			throws ProductNotFoundException, CategoryNotFoundException {
		  
		return repo.filterProductsWithinPriceRange(category_id, minPrice, maxPrice);
	}
	
	@Override
	public List<Product> sortProductsByPriceAscending(int category_id) throws CategoryNotFoundException {
		  
		return repo.sortProductsByPriceAscending(category_id);
	}

	@Override
	public List<Product> sortProductsByPriceDescending(int category_id) throws CategoryNotFoundException {
		  
		return repo.sortProductsByPriceDescending(category_id);
	}

	@Override
	public List<Product> sortProductsByViewCountDescending(int category_id) throws CategoryNotFoundException {
		  
		return repo.sortProductsByViewCount(category_id);
	}

	@Override
	public List<Product> sortProductsByRatingsDescending(int category_id) throws CategoryNotFoundException {
		  
		return repo.sortProductsByRatings(category_id);
	}









}
