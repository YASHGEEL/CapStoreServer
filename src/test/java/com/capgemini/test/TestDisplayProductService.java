package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.Category;
import com.capgemini.model.Customer;
import com.capgemini.model.DisplayProductUtil;
import com.capgemini.model.FeedBack;
import com.capgemini.model.IDisplayProductUtil;
import com.capgemini.model.Product;
import com.capgemini.repository.DisplayProductRepository;
import com.capgemini.service.DisplayProductService;
import com.capgemini.service.DisplayProductServiceImpl;

public class TestDisplayProductService {

	DisplayProductService service;
	
	@Mock
	DisplayProductRepository repo;
	
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

		service = new DisplayProductServiceImpl(repo);

	}
	
	
	@Test(expected = com.capgemini.exception.ProductNotFoundException.class)
	public void whenInvalidcategoryIsSelectedProductNotFoundExceptionIsRaised() throws ProductNotFoundException, CategoryNotFoundException {
		service.displayProducts(0);
	}
	
	@Test(expected = com.capgemini.exception.CategoryNotFoundException.class)
	public void whenInvalidcategoryIsSelectedCategoryNotFoundExceptionIsRaised() throws ProductNotFoundException, CategoryNotFoundException {
		service.displayProducts(-10);
	}
	
	
	@Test
	public void ValidDataIsRetrievedForValidCategory() throws ProductNotFoundException, CategoryNotFoundException {
		
		List<FeedBack> feedbackList1 = new ArrayList<FeedBack>();
		List<FeedBack> feedbackList2 = new ArrayList<FeedBack>();

		List<IDisplayProductUtil> productList = new ArrayList<IDisplayProductUtil>();

		FeedBack feedBack1 = new FeedBack(1, null, null,
				new Customer(2, null, null, "Jane", "Nagpur", null, null, null, null, null, null, null, null), null,
				"Very cool sound experience", 4);
		FeedBack feedBack2 = new FeedBack(2, null, null,
				new Customer(3, null, null, "Phoebe", "Pune", null, null, null, null, null, null, null, null), null,
				"Treat for ears", 3);
		FeedBack feedBack3 = new FeedBack(3, null, null,
				new Customer(1, null, null, "Chandler", "Nagpur", null, null, null, null, null, null, null, null), null,
				"Very bad sound", 1);

		feedbackList1.add(feedBack1);
		feedbackList1.add(feedBack2);

		feedbackList2.add(feedBack3);

		Product product1 = new Product(1, null, null, "Headphones", "JBL", "Heavenly abode", 699, null, 2, null, 0, 3,
				null, null, null, new Category(2, null, null, "Electronics"), feedbackList1);
		Product product2 = new Product(2, null, null, "Headphones", "Soundmagic", "experience magic of sound", 499,
				null, 2, null, 0, 3, null, null, null, new Category(2, null, null, "Electronics"), feedbackList2);

		IDisplayProductUtil util1 = new DisplayProductUtil().myFunct(product1);
		IDisplayProductUtil util2 = new DisplayProductUtil().myFunct(product2);

		productList.add(util1);
		productList.add(util2);

		// when(repo.displayProducts(2)).thenReturn(productList);

		when(repo.findByCategoryIdOrderByCostAsc(2)).thenReturn(productList);

		List<IDisplayProductUtil> utilList = service.displayProducts(2);
		assertEquals(utilList.get(0).getBrand(), productList.get(0).getBrand());
		assertEquals(utilList.get(0).getAverageRating(), productList.get(0).getAverageRating(), 0.0001);
		assertEquals(utilList.get(0).getCategory().getId(), productList.get(0).getCategory().getId());
		assertEquals(utilList.get(0).getFeedback().get(0).getFeedbackResponse(),
				productList.get(0).getFeedback().get(0).getFeedbackResponse());
		assertEquals(utilList.get(0).getFeedback().get(0).getCustomer().getName(),
				productList.get(0).getFeedback().get(0).getCustomer().getName());

	}
		
	}
	
	
	
	
	
	

