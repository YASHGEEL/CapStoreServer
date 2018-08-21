package com.capgemini.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Category;
import com.capgemini.model.Product;
import com.capgemini.model.ProductSummary;
import com.capgemini.service.IManagingInventory;
import com.capgemini.service.ManagingInventoryImpl;

@RestController
public class ManagingInventoryController {
	@Autowired
	IManagingInventory manageInventory;
	{
		manageInventory = new ManagingInventoryImpl();
	}

	@RequestMapping(value = "/hello")
	public String sayHello() {
		return "Hello from 10.220.57.22";
	}

	// @CrossOrigin(value="*")
	@RequestMapping(value = "/displayAllProducts")
	List<Product> displayAllProducts() {
		/*
		 * List<Product> p = new ArrayList<Product>(); List<Product> dbResult =
		 * manageInventory.displayListOfProducts(); p.add(dbResult.get(1));
		 */
		return manageInventory.displayListOfProducts();
		// return manageInventory.displayListOfProducts();
	}

	@RequestMapping(value = "/displayNotApprovedProducts")
	List<Product> displayNotApprovedProducts() {
		
		return manageInventory.displayListOfNotApprovedProducts();
	}
	@RequestMapping(value = "/displayApprovedProducts")
	List<Product> displayApprovedProducts() {
		
		return manageInventory.displayListOfApprovedProducts();
	}	
	@RequestMapping(value = "/validateProduct")
	Product validateProduct(@RequestBody Product product) {
		return manageInventory.validateProduct(product);
	}

	@RequestMapping(value = "/removeProduct", method = RequestMethod.POST)
	void removeProduct(@RequestBody int id) {
		manageInventory.removeExistingProduct(id);
	}

	@RequestMapping(value = "/removeCategory", method = RequestMethod.POST)
	void removeCategory(@RequestBody int id) {
		manageInventory.removeExistingCategory(id);
	}

	@RequestMapping(value = "/addNewProduct", method = RequestMethod.POST)
	Product addNewProduct(@RequestBody Product product) {
		return manageInventory.addNewProduct(product);
	}

	@RequestMapping(value = "/getProductDetails")
	Product addNewProduct(int id) {
		return manageInventory.getProductdetails(id);
	}

	@RequestMapping(value = "/editExistingProduct", method = RequestMethod.POST)
	Product editExistingProduct(@RequestBody Product product) {
		return manageInventory.editExistingProductDetails(product);
	}

	@RequestMapping(value = "/displayAllCategory")
	List<Category> displayAllCategory() {
		return manageInventory.displayListOfCategories();
	}

	@RequestMapping(value = "/addNewCategory", method = RequestMethod.POST)
	Category addNewCategory(@RequestBody Category category) {
		return manageInventory.addNewCategory(category);
	}
}
