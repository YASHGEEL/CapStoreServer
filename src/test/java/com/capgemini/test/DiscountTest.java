package com.capgemini.test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DiscountTest {
	@Before
	public void init() {
		
	}
	@Test(expected=com.capgemini.exception.ProductNotFoundException.class)
	public void InvalidProductId() {
	
	}
	@Test(expected=com.capgemini.exception.DiscountDateExceededException.class)
	public void DiscountValidityDateNotStarted() {	
	
	}
	@Test(expected=com.capgemini.exception.DiscountDateExceededException.class)
	public void DiscountValidityExpired() {
	
	}
	@Test
	public void SuccessfullyDiscountApplied() {
	}
	@After
	public void close() {
		
	}
}
