package com.capgemini.service;

import com.capgemini.exception.InvalidCustomerIdException;
import com.capgemini.model.Customer;

public interface ShippingDetails {
	public abstract Customer gettingShippingDeatilsOfCustomer(int customerId) throws InvalidCustomerIdException;

}
