package com.capgemini.service;

import java.util.ArrayList;

import com.capgemini.model.Product;

public interface SimilarProductsInterface {
	ArrayList<Product> findSimilarProductsByProductRef(int id);
}
