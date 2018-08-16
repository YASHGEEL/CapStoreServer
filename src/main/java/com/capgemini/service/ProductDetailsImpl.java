package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Product;
import com.capgemini.repository.ProductDetails;

@Service("service")
public class ProductDetailsImpl implements ProductDetailsService {
	@Autowired(required = true)
	ProductDetails repo;

	@Override
	@Transactional
	public Product getProductDetails(int id) {
		/*//Product mobile1= repo.getDetails(id);
		int id1=repo.getDetails(id);
		ArrayList<Product> product = null;
		//product.add(mobile1);
		System.out.println(id1);*/
		//repo.getProductDetails(id);
	//	System.out.println(product);
		return repo.getProductDetails(id);
	}

}
