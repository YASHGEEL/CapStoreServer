package com.capgemini.service;

import java.sql.Date;
import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Cart;
import com.capgemini.model.Customer;
import com.capgemini.model.WishList;
import com.capgemini.repository.SignUpCustomerRepository;

@Service("service1")
public class signUpCustomerImpl implements signUpCustomer {

	@Autowired
	public SignUpCustomerRepository repo;

	@Transactional
	@Override
	public String addCustomer(Customer customer) {

		customer.setStartTime(Date.valueOf(LocalDate.now()));

		Customer cust1 = repo.getCustomerPhone(customer.getPhone());
		Customer cust = repo.getCustomer(customer.getEmail());
		if (cust == null && cust1 == null) {
			boolean status = validatePhone(customer.getPhone());
			if (status == true) {

				repo.save(customer);

				return null;
			}

			return null;

		} else {

			return "Customer account already exists";

		}

	}

	private boolean validatePhone(String phone) {

		if (phone.matches("[6-9][0-9]{9}")) {
			return true;
		} else
			return false;
	}

}