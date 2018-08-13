package com.capgemini.junit;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.repository.UserRepository;
import com.capgemini.service.UpdateStatus;
import com.capgemini.service.UpdateStatusImpl;

public class TestClass {

UpdateStatus service;
	
	@Mock
	UserRepository user;
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		service = new UpdateStatusImpl(user);
	}
	
	@Test
	public void CheckWhetheOrderIdIsValid() {
		
	}
	
	@Test
	public void CheckWhetheOrderIdIsInvalid() {
		
	}
	
	@Test
	public void CheckIfDefaultStatusNotDelivered() {
		
	}
}
