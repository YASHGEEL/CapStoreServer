package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Category;
import com.capgemini.model.Product;
import com.capgemini.model.ProductSummary;

public interface IManagingInventory {
	List<Product> displayListOfProducts();

	Product addNewProduct(Product product);

	Product editExistingProductDetails(Product product);

	void removeExistingProduct(int productId);

	List<Category> displayListOfCategories();

	Category addNewCategory(Category category);

	void removeExistingCategory(int categoryId);

	Product getProductdetails(int id);

	Product validateProduct(Product product);

	List<Product> displayListOfNotApprovedProducts();

	List<Product> displayListOfApprovedProducts();


}



