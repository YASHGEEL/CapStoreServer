package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.OldPasswordNotFoundExcepetion;
import com.capgemini.service.IChangePassword;

@RestController
public class ChangePasswordController {
	
	@Autowired
	IChangePassword service;	
	
	
	@RequestMapping("/get")
	String get()
	{
		return "Helloo...";
	}
	@RequestMapping(value="/changePassword/{email},{oldPassword},{newPassword}", method=RequestMethod.POST) 
	public String changePasswordForCustomer(@PathVariable String email,@PathVariable String oldPassword,@PathVariable String newPassword) 
	{
		String result;
		try {
			result = service.changePasswordForCustomer(email,oldPassword,newPassword);
			return result;
		} 
		catch (OldPasswordNotFoundExcepetion e) {
			
			return e.getMessage();
		}
		
	}

	@RequestMapping(value="/changePasswordMerch/{email},{oldPassword},{newPassword}", method=RequestMethod.POST) 
	public String changePasswordForMerchant(@PathVariable String email,@PathVariable String oldPassword,@PathVariable String newPassword) 
	{
		String result;
		try {
			result = service.changePasswordForMerchant(email, oldPassword, newPassword);
			return result;
		} 
		catch (OldPasswordNotFoundExcepetion e) {			
			return e.getMessage();
		}
		
	}
}
