package com.capgemini.service;

import com.capgemini.model.Customer;

public interface signUpCustomer {
	public String addCustomer(Customer customer);
	public Customer findCustomerByid(int id);

}
