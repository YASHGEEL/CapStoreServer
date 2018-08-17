package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.InvalidEmailIdException;
import com.capgemini.exception.SecurityAnswerNotMatchedException;
import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.service.IForgetPassword;

@RestController
public class ForgetPasswordController {

	@Autowired
	IForgetPassword service;
	@RequestMapping(value="/get/{email}",method=RequestMethod.GET)
	public Customer getemail(@PathVariable String email) 
	{
		Customer customer;
		
			try {
				customer = service.customerForgetPasswordEnterEmailId(email);
				return customer;
			} catch (InvalidEmailIdException e) {
				System.out.println(e.getMessage());
				return null;
			} 
		
	
		
	}                                                                                                
	@RequestMapping(value="/getsecans/{securityAnswer}",method=RequestMethod.POST)
	public Customer getsecans(@RequestBody Customer customer,@PathVariable String securityAnswer) throws SecurityAnswerNotMatchedException
	{
		try {
			Customer customer1=service.customerForgetPasswordEnterAnswer(customer,securityAnswer);
			return customer1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}
	
	@RequestMapping(value="/getnewpass/{newPassword}",method=RequestMethod.POST)
	public String getnewpass(@RequestBody Customer customer,@PathVariable String newPassword)
	{
		String newpassword1=service.customerForgetPasswordChangeNewPassword(customer, newPassword);
		
		return newpassword1;
		
	}
	
	
	//For Merchant
	
	@RequestMapping(value="/getformerchant/{email}",method=RequestMethod.GET)
	public Merchant getemailForMerchant(@PathVariable String email) 
	{
		Merchant merchant;
		
			try {
				merchant = service.merchantForgetPasswordEnterEmailId(email);
				return merchant;
			} catch (InvalidEmailIdException e) {
				System.out.println(e.getMessage());
				return null;
			} 
		
	
		
	}                                                                                                
	@RequestMapping(value="/getsecansformerchant/{securityAnswer}",method=RequestMethod.POST)
	public Merchant getsecansForMerchant(@RequestBody Merchant merchant,@PathVariable String securityAnswer) throws SecurityAnswerNotMatchedException
	{
		try {
			Merchant merchant1=service.merchantForgetPasswordEnterAnswer(merchant,securityAnswer);
			return merchant1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}
	
	@RequestMapping(value="/getnewpassForMerchant/{newPassword}",method=RequestMethod.POST)
	public String getnewpassForMerchant(@RequestBody Merchant merchant,@PathVariable String newPassword)
	{
		String newpassword1=service.merchantForgetPasswordChangeNewPassword(merchant, newPassword);
		
		return newpassword1;
		
	}
	
	
}
