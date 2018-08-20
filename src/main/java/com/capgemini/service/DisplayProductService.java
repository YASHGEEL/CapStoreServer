package com.capgemini.service;

import java.util.List;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.IDisplayProductUtil;

public interface DisplayProductService {

	public List<IDisplayProductUtil> displayProducts(int categoryId)
			throws ProductNotFoundException, CategoryNotFoundException;

}
