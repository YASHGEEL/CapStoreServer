package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Category;
import com.capgemini.model.Product;
import com.capgemini.service.IManagingInventory;
import com.capgemini.service.ManagingInventoryImpl;

@RestController
public class ManagingInventoryController {
	@Autowired
	IManagingInventory manageInventory;
	{
		manageInventory=new ManagingInventoryImpl();
	}
	
	@RequestMapping(value="/displayAllProducts")
	List<Product> displayAllProducts(int categoryId)
	{
		return manageInventory.displayListOfProducts(categoryId);
	}
	@RequestMapping(value="/addNewProduct",method=RequestMethod.POST)
	Product addNewProduct(@RequestBody Product product) {
		return manageInventory.addNewProduct(product);
	}
	@RequestMapping(value="/editExistingProduct",method=RequestMethod.POST)
	Product editExistingProduct(@RequestBody Product product) {
		return manageInventory.editExistingProductDetails(product);
	}
	@RequestMapping(value="/displayAllCategory")
	List<Category> displayAllCategory()
	{
		return manageInventory.displayListOfCategories();
	}
	@RequestMapping(value="/addNewCategory",method=RequestMethod.POST)
	Category addNewCategory(@RequestBody Category category) {
		return manageInventory.addNewCategory(category);
	}
}
