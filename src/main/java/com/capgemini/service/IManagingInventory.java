package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Category;
import com.capgemini.model.Product;

public interface IManagingInventory {
	List<Product> displayListOfProducts(int categoryId);
	Product addNewProduct(Product product);
	Product editExistingProductDetails(Product product);
	void removeExistingProduct(int productId);
		List<Category> displayListOfCategories();
	Category addNewCategory(Category category);
	void removeExistingCategory(int categoryId);

}
