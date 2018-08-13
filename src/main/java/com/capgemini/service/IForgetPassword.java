package com.capgemini.service;

import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;

public interface IForgetPassword {
	
	
	//for customer model
	public Customer  customerForgetPasswordEnterEmail(String email);
	
	public Customer customerForgetPasswordEnterAnswer(Customer customer,String securityAnswer);
	
	
	public String customerForgetPasswordChangeNewPassword(Customer customer,String newpassword);
	
	
	
	//for merchant model
    public Merchant merchantForgetPasswordEnterEmail(String email);
	
	public Merchant merchantForgetPasswordEnterAnswer(Merchant merchant,String securityAnswer);
	
	
	public String merchantForgetPasswordChangeNewPassword(Merchant merchant,String newpassword);

}
