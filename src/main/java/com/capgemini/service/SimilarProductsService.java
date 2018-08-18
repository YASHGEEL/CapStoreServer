package com.capgemini.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Category;
import com.capgemini.model.Product;
import com.capgemini.repository.SimilarProductsRepository;

@Service
public class SimilarProductsService implements SimilarProductsInterface {

	@Autowired
	SimilarProductsRepository repo;

	@Override
	public ArrayList<Product> findSimilarProductsByProductRef(int id) {
		ArrayList<Product> similarProducts;
		similarProducts = repo.findSimilarProductsByProductRef(id);
		return similarProducts;
	}

	
}
