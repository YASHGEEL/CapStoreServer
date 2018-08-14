package com.capgemini.service;

import com.capgemini.exception.OldPasswordNotFoundExcepetion;

public interface IChangePassword {

	//To change password for customer
	public String changePasswordForCustomer(String email, String oldPassword, String newPassword) throws OldPasswordNotFoundExcepetion;

	//To change password for merchant
	public String changePasswordForMerchant(String email, String oldPassword, String newPassword) throws OldPasswordNotFoundExcepetion;

}
