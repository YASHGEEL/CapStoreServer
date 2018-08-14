package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Customer;
import com.capgemini.model.OrderDetails;
import com.capgemini.repository.UserRepository;  
@Service  
public class UpdateStatusImpl implements UpdateStatus {

	public UpdateStatusImpl(UserRepository user) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setId(OrderDetails order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String updateDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	


}  