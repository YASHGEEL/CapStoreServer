package com.capgemini.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Product;
import com.capgemini.service.SimilarProductsInterface;

@RestController
public class SimilarProductsController {
	@Autowired
	SimilarProductsInterface similarProductsInterface;
	
	@RequestMapping(value="/findSimilarProductsByProductRef")
	public ArrayList<Product> findSimilarProductsByProductRef(int id){
		return similarProductsInterface.findSimilarProductsByProductRef(id);
	}

}
