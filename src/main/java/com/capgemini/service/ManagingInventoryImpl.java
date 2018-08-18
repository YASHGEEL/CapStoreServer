package com.capgemini.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.model.Category;
import com.capgemini.model.Product;
import com.capgemini.repository.CategoryInventoryRepository;
import com.capgemini.repository.ProductInventoryRepository;
@Component
public class ManagingInventoryImpl implements IManagingInventory{
	
	@Autowired
	ProductInventoryRepository productInventoryRepository;
	@Autowired
	CategoryInventoryRepository categoryInventoryRepository;

	@Override
	public List<Product> displayListOfProducts(int categoryId) {
		
		return productInventoryRepository.displayListOfProducts(categoryId);
	}

	@Override
	public Product addNewProduct(Product product) {
		product.setStartTime(Date.valueOf(LocalDate.now()));
		return productInventoryRepository.save(product);
	}

	@Override
	public Product editExistingProductDetails(Product product) {
		
		return productInventoryRepository.save(product);
	}

	@Override
	public void removeExistingProduct(int productId) {
		productInventoryRepository.deleteById(productId);
		
	}

	@Override
	public List<Category> displayListOfCategories() {
		return categoryInventoryRepository.findAll();
	}

	@Override
	public Category addNewCategory(Category category) {
		category.setStartTime(Date.valueOf(LocalDate.now()));
		return categoryInventoryRepository.save(category);
	}

	@Override
	public void removeExistingCategory(int categoryId) {
		categoryInventoryRepository.deleteById(categoryId);
		
	}

}
