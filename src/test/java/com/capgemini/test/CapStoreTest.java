package com.capgemini.test;

import org.mockito.Mock;

import com.capgemini.repository.SearchAdminRepository;
import com.capgemini.repository.SearchCustomerRepository;
import com.capgemini.repository.SearchMerchantRepository;

public class CapStoreTest {
	@Mock
	SearchCustomerRepository customerRepo;

	@Mock
	SearchAdminRepository adminRepo;

	@Mock
	SearchMerchantRepository merchantRepo;
}
