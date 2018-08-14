package com.capgemini.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class testChangePassword {

	@Before
	public void setUp()
	{
		
	}
	
	/*
	 * 1.When customer enter invalid email
	 * 2.When customer enter old password which does not match with db password
	 * 3.When customer enter invalid new password
	 * 4.When customer enter all valid details 
	 */
	@Test(expected=NullPointerException.class)
	public void whenCustomerEmailDoesNotExist() throws NullPointerException
	{
		
	}
	
	
	@Test(expected=NullPointerException.class) 
	public void whenCustomerOldPasswordDoesNotExist() throws NullPointerException
	{
		
	}
	
	@Test(expected=NullPointerException.class)
	public void whenCustomerNewPasswordIsInvalid() throws NullPointerException
	{
		
	}
	
	@Test
	public void whenAllCustomerDetailsAreValid()
	{
		
	}
	
	/*
	 * 1.When merchant enter invalid email
	 * 2.When merchant enter old password which does not match with db password
	 * 3.When merchant enter invalid new password
	 * 4.When merchant enter all valid details 
	 */
	@Test(expected=NullPointerException.class)
	public void whenMerchantEmailDoesNotExist() throws NullPointerException
	{
		
	}
	
	
	@Test(expected=NullPointerException.class)
	public void whenMerchantOldPasswordDoesNotExist() throws NullPointerException
	{
		
	}
	
	@Test(expected=NullPointerException.class)
	public void whenMerchantNewPasswordIsInvalid() throws NullPointerException
	{
		
	}
	
	@Test
	public void whenAllMerchantDetailsAreValid()
	{
		
	}
	
	@After
	public void close()
	{
		
	}
	
}
