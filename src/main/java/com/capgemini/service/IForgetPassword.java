package com.capgemini.service;

import com.capgemini.exception.InvalidEmailIdException;
import com.capgemini.exception.SecurityAnswerNotMatchedException;
import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;

public interface IForgetPassword {
	
	
	//for customer model
	public Customer  customerForgetPasswordEnterEmail(String email) throws InvalidEmailIdException;
	
	public Customer customerForgetPasswordEnterAnswer(Customer customer,String securityAnswer) throws SecurityAnswerNotMatchedException;
	
	
	public String customerForgetPasswordChangeNewPassword(Customer customer,String newpassword);
	
	
	
	//for merchant model
    public Merchant merchantForgetPasswordEnterEmail(String email) throws InvalidEmailIdException;
	
	public Merchant merchantForgetPasswordEnterAnswer(Merchant merchant,String securityAnswer) throws SecurityAnswerNotMatchedException;
	
	
	public String merchantForgetPasswordChangeNewPassword(Merchant merchant,String newpassword);

}
