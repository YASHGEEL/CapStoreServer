package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.Product;
import com.capgemini.service.SortService;

@RestController
public class SortController {

	@Autowired
	SortService service;
	
	@RequestMapping(value="/first")
	public String  initit() {
		return "Hello Started";
		
	}
	
	@RequestMapping(value="/priceAsc")
	public List<Product> getSortedProductsByPriceAsc(@RequestParam(value="id", required=false) int id){
		try {
				return service.sortProductsByPriceAscending(id);
		} catch (CategoryNotFoundException e) {
			
			System.err.println(e.getMessage());
		}
		return null;
		
	}
	
	
	@RequestMapping(value="/priceDesc")
	public List<Product> getSortedProductsByPriceDesc(@RequestParam(value="id", required=false) int id){
		try {
				return service.sortProductsByPriceDescending(id);
		} catch (CategoryNotFoundException e) {
			
			System.err.println(e.getMessage());
		}
		return null;
		
	}
	
	
	@RequestMapping(value="/byViews")
	public List<Product> getSortedProductsByViewCount(@RequestParam(value="id", required=false) int id){
		try {
				return service.sortProductsByViewCountDescending(id);
		} catch (CategoryNotFoundException e) {
			
			System.err.println(e.getMessage());
		}
		return null;
		
	}
	
	
	@RequestMapping(value="/byRating")
	public List<Product> getSortedProductsByRatings(@RequestParam(value="id", required=false) int id){
		try {
				return service.sortProductsByRatingsDescending(id);
		} catch (CategoryNotFoundException e) {
			
			System.err.println(e.getMessage());
		}
		return null;
		
	}
	
	@RequestMapping(value="/byRange")
	public List<Product> filterProductsByPriceRange(@RequestParam(value="id", required=false)int id,
			@RequestParam(value="min", required=false)float minPrice,
			@RequestParam(value="max", required=false)float maxPrice){
		
		try {
			return service.viewProductsInRange(id, minPrice, maxPrice);
		} catch (ProductNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (CategoryNotFoundException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
	
}





















