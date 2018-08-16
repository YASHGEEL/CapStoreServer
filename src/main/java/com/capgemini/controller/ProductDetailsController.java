package com.capgemini.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Product;
import com.capgemini.repository.ProductDetails;
import com.capgemini.service.ProductDetailsImpl;
import com.capgemini.service.ProductDetailsService;
@RestController
public class ProductDetailsController {

	@Autowired
	ProductDetailsService service;
	
	@RequestMapping(value="/getProductDetails/{id}")
	public Product getProductDetails(@PathVariable int id){
		 return service.getProductDetails(id);
		 
	}
}
