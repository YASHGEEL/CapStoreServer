package com.capgemini.service;

public interface IChangePassword {

	//To change password for customer
	public String changePasswordForCustomer(String email, String oldPassword, String newPassword);

	//To change password for merchant
	public String changePasswordForMerchant(String email, String oldPassword, String newPassword);

}
