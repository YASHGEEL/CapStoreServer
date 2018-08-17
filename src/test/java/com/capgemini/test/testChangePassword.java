package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.OldPasswordNotFoundExcepetion;
import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.repository.ChangePasswordCustomerRepo;
import com.capgemini.repository.ChangePasswordMerchantRepo;
import com.capgemini.service.ChangePasswordImpl;
import com.capgemini.service.IChangePassword;


public class testChangePassword {

	
	IChangePassword service;
	
	@Mock
	ChangePasswordCustomerRepo repoCustomer;
	
	@Mock
	ChangePasswordMerchantRepo repoMerchant;
	
	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		service=new ChangePasswordImpl(repoCustomer,repoMerchant);
	}
	
	/*
	 * 1.When customer enter invalid email
	 * 2.When customer enter old password which does not match with db password
	 * 3.When customer enter new password is same as old password
	 * 4.When customer enter all valid details 
	 */
	@Test(expected=NullPointerException.class)
	public void whenCustomerEmailDoesNotExist() throws NullPointerException, OldPasswordNotFoundExcepetion
	{
		//if emailid does not exist
		Customer customer = new Customer(222, null, null, "Tom", "Delhi", "9998877766", "tom@gmail.com", "tom", null, null, null, null, null);		
		when(repoCustomer.getCustomer(customer.getEmail())).thenReturn(customer);	
		service.changePasswordForCustomer("t@gmail.com", "tom", "t1");
	}
	
	
	@Test(expected=com.capgemini.exception.OldPasswordNotFoundExcepetion.class) 
	public void whenCustomerOldPasswordDoesNotExist() throws OldPasswordNotFoundExcepetion  
	{
		Customer customer = new Customer(222, null, null, "Tom", "Delhi", "9998877766", "tom@gmail.com", "tom", null, null, null, null, null);		
		when(repoCustomer.getCustomer(customer.getEmail())).thenReturn(customer);
		String s=service.changePasswordForCustomer(customer.getEmail(), "t", "t");		
	}
	
	@Test(expected=com.capgemini.exception.OldPasswordNotFoundExcepetion.class)
	public void whenCustomerNewPasswordIsInvalid() throws NullPointerException, OldPasswordNotFoundExcepetion
	{
		Customer customer = new Customer(222, null, null, "Tom", "Delhi", "9998877766", "tom@gmail.com", "tom", null, null, null, null, null);		
		when(repoCustomer.getCustomer(customer.getEmail())).thenReturn(customer);
		String s=service.changePasswordForCustomer(customer.getEmail(), "tom", "tom");
	}
		
	@Test
	public void whenAllCustomerDetailsAreValid() throws OldPasswordNotFoundExcepetion
	{
		Customer customer = new Customer(222, null, null, "Tom", "Delhi", "9998877766", "tom@gmail.com", "tom", null, null, null, null, null);
		when(repoCustomer.getCustomer(customer.getEmail())).thenReturn(customer);
		String s=service.changePasswordForCustomer(customer.getEmail(), "tom", "tom123");
		assertEquals("New Password Updated Successfully!", s);
	}
	
	/*
	 * 1.When merchant enter invalid email
	 * 2.When merchant enter old password which does not match with db password
	 * 3.When merchant enter new password is same as old password
	 * 4.When merchant enter all valid details 
	 */
	@Test(expected=NullPointerException.class)
	public void whenMerchantEmailDoesNotExist() throws NullPointerException, OldPasswordNotFoundExcepetion
	{
		Merchant merchant = new Merchant(333, null, null, "Jerry", "Paris", "9875554466", "Approved", "jerry@yahoo.com", "j123", null, null, null, 5, null);
		when(repoMerchant.getMerchant(merchant.getEmail())).thenReturn(merchant);	
		service.changePasswordForMerchant("j@yahoo.com", "j123", "j123");	
	}
	
	
	@Test(expected=com.capgemini.exception.OldPasswordNotFoundExcepetion.class)
	public void whenMerchantOldPasswordDoesNotExist() throws OldPasswordNotFoundExcepetion
	{
		Merchant merchant = new Merchant(333, null, null, "Jerry", "Paris", "9875554466", "Approved", "jerry@yahoo.com", "j123", null, null, null, 5, null);
		when(repoMerchant.getMerchant(merchant.getEmail())).thenReturn(merchant);
		String s=service.changePasswordForMerchant(merchant.getEmail(), "j", "j");
	}
	
	@Test(expected=com.capgemini.exception.OldPasswordNotFoundExcepetion.class)
	public void whenMerchantNewPasswordIsInvalid() throws OldPasswordNotFoundExcepetion
	{
		Merchant merchant = new Merchant(333, null, null, "Jerry", "Paris", "9875554466", "Approved", "jerry@yahoo.com", "j123", null, null, null, 5, null);
		when(repoMerchant.getMerchant(merchant.getEmail())).thenReturn(merchant);
		String s=service.changePasswordForMerchant(merchant.getEmail(), "j123", "j123");
	}
	
	@Test
	public void whenAllMerchantDetailsAreValid() throws OldPasswordNotFoundExcepetion
	{
		Merchant merchant = new Merchant(333, null, null, "Jerry", "Paris", "9875554466", "Approved", "jerry@yahoo.com", "j123", null, null, null, 5, null);
		when(repoMerchant.getMerchant(merchant.getEmail())).thenReturn(merchant);
		String s=service.changePasswordForMerchant(merchant.getEmail(), "j123", "j@123");
		assertEquals("New Password Updated Successfully!", s);
	}
	
	@After
	public void close()
	{
		service=null;
	}
	
}
