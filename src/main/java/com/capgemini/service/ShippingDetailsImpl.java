package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.InvalidCustomerIdException;
import com.capgemini.model.Customer;
import com.capgemini.repository.ShippingDetailsRepository;
import com.capgemini.repository.UserRepository;

@Service
public class ShippingDetailsImpl implements ShippingDetails {
	@Autowired
	ShippingDetailsRepository repo;

	public ShippingDetailsImpl(ShippingDetailsRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	
	public Customer gettingShippingDeatilsOfCustomer(int customerId) throws InvalidCustomerIdException {
		return null;	
		
	}

}
