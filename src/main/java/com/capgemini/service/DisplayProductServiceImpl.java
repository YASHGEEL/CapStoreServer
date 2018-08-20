package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.IDisplayProductUtil;
import com.capgemini.repository.DisplayProductRepository;

@Service("service")
public class DisplayProductServiceImpl implements DisplayProductService {

	@Autowired
	DisplayProductRepository repo;

	public DisplayProductServiceImpl(DisplayProductRepository repo2) {
		super();
		this.repo = repo2;
	}

	@Override
	public List<IDisplayProductUtil> displayProducts(int categoryId)
			throws ProductNotFoundException, CategoryNotFoundException {

		if (categoryId < 0) {
			throw new CategoryNotFoundException();
		}

		List<IDisplayProductUtil> utilList = new ArrayList<IDisplayProductUtil>();

		utilList = repo.findByCategoryIdOrderByCostAsc(categoryId);

		if (utilList.isEmpty()) {
			throw new ProductNotFoundException();
		}

		return utilList;
	}

}
