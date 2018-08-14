package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Category;
import com.capgemini.model.Product;

public interface SortService {

	public List<Product> viewProductsInRange(Category category, float minPrice, float maxPrice);
	public List<Product> sortProductsInAscending(Category category);
	public List<Product> sortProductsInDescending(Category category);
	public List<Product> viewProductsByMaxCount(Category category);
}
