package com.capgemini.test;
import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.Test;

import com.capgemini.exception.InvalidInputException;
import com.capgemini.model.PromoCode;

public class TestPromo {

	PromoCode promocode=new PromoCode();
	@Test(expected=com.capgemini.exception.InvalidInputException.class)
	public void TestPromoName() throws InvalidInputException
	{
		
		assertEquals("BNMC", promocode.getName());
	}
	
	@Test(expected=com.capgemini.exception.InvalidInputException.class)
	public void TestPromoDescription()  throws InvalidInputException
	{
		assertEquals("This coupon is valid if the minimum amount purchased is above 1000 and the discount you get is 150 by applying this coupon", promocode.getDescription());
	}
	
	@Test
	public void TestPromoStartdate()  throws InvalidInputException
	{
		 
	}
	
	@Test
	public void TestPromoEnddate()  throws InvalidInputException
	{
		
	}
	
	@Test(expected=com.capgemini.exception.InvalidInputException.class)
	public void TestPromoMinamount()  throws InvalidInputException
	{
		assertEquals("12000", promocode.getMinimumAmount());
	}
	
	@Test(expected=com.capgemini.exception.InvalidInputException.class)
	public void TestPromoDisamount()  throws InvalidInputException
	{
		assertEquals("200.00f", promocode.getDiscountAmount());
	}
	
	
}
