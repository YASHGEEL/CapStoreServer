package com.capgemini.test;

import java.util.InputMismatchException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.ProductNotFoundException;

public class TestSortService {

	
	@Before
	public void initMethod() {
		
	}
	
	
	//************************************** following test cases checks for categories************************************** 
	@Test
	public void validateCategoryOneProducts() {
		
	}
	
	
	@Test
	public void validateCategoryTwoProducts() {
		
	}
	
	
	@Test
	public void validateCategoryThreeProducts() {
		
	}
	
	
	@Test
	public void validateCategoryFourProducts() {
		
	}
	
	
	//***************************************************************************************************************************
	
	
	@Test(expected=ProductNotFoundException.class)
	public void displayEmptyList() {
		
	}
	
	
	@Test(expected=CategoryNotFoundException.class)
	public void displayEmptyList1() {
		
	}
	
	@Test(expected=InputMismatchException.class)
	public void InvalidInputPassedIn_viewProductsInRange(){
		
	}
	
	@After
	public void finalMethod() {
		
	}
	
	
	
}
