package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Category;
import com.capgemini.model.Product;

public interface IManagingInventory {
	List<Product> displayListOfProducts(Category category);
	Product addNewProduct(Product product);
	Product editExistingProductDetails(Product product);
	void removeExistingProduct(Product product);
	int displayStockCount(Product product);
	void updatingStockCount(int count);
	List<Category> displayListOfCategories(Category category);
	Category addNewCategory(Category category);
	void removeExistingCategory(Category category);

}
