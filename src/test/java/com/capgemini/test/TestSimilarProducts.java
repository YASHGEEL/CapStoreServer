package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.MerchantNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.Product;

public class TestSimilarProducts {
	Product mobile = new Product();

	@Test
	public void TestProductId() {
		int testId = mobile.getId();
		assertEquals(123, testId);
	}

	@Test (expected=ProductNotFoundException.class)
	public void TestProductNameNull() {
		assertEquals(null, mobile.getName());
	}

	@Test
	public void TestProductNameNotNull() {
		assertEquals("Samsung S9 plus", mobile.getName());
	}

	@Test(expected=ProductNotFoundException.class)
	public void TestProductBrandNull() {
		assertEquals(null, mobile.getBrand());
	}

	@Test
	public void TestProductBrandNotNull() {
		assertEquals("Samsung", mobile.getBrand());
	}

	@Test(expected=CategoryNotFoundException.class)
	public void TestProductCategoryNull() {
		assertEquals(null, mobile.getCategory());
	}

	@Test
	public void TestProductCategoryNotNull() {
		assertEquals("Electronics", mobile.getCategory());
	}

	@Test
	public void TestProductViewCountNotNull() {
		assertEquals(5, mobile.getViewCount());
	}

	@Test 
	public void TestProductViewCartNull() {
		assertEquals(null, mobile.getViewCount());
	}

	@Test
	public void TestProductCostNotNull() {
		assertEquals(12000, mobile.getCost());
		

	}

	
	@Test // (expected=)
	public void TestProductCostNull() {
		assertEquals(0, mobile.getCost());

	}

	@Test // (expected=)
	public void TestProductAvgRatingNotNull() {
		assertEquals(5, mobile.getAverageRating());
	}

	@Test
	public void TestProductAvgRatingNull() {
		assertEquals(0, mobile.getAverageRating());
	}

	@Test(expected=MerchantNotFoundException.class)
	public void TestMerchantNull() throws MerchantNotFoundException{
		assertEquals(null, mobile.getMerchant());

	}

	@Test // (expected=)
	public void TestProductDiscountNull() {
		assertEquals(null, mobile.getAverageRating());
	}

	@Test
	public void TestProductDiscountNotNull() {
		assertEquals(0, mobile.getDiscount());
	}

	/*@Test
	public void TestProductEndTime() {

		
		 * mobile.getFeedback(); mobile.getImageUrl(); mobile.getMerchant();
		 * mobile.getStartTime(); mobile.getStatus(); mobile.getViewCount();
		  }*/

}
