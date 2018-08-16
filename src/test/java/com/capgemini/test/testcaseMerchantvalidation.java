package com.capgemini.test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.model.Merchant;
import com.capgemini.repository.MerchantRepository;
import com.capgemini.service.MerchantValidateService;


public class testcaseMerchantvalidation {

    /*MerchantValidateService validateService;
    @Mock
	MerchantRepository repo;*/

	@Before
	public void setUp() throws Exception {
/*		MockitoAnnotations.initMocks(this);
		
      validateService=new MerchantValidateServiceImpl(repo);
*/	}
	
	/*
	 * Test cases for merchant validation
	 * 1.When admin approves the merchant account
	 * 2.When admin disapproves the merchant account
	 */
    @Test
    public void whenMerchantisApproved() {
    	
/*    	Merchant merchant=new Merchant();
    	merchant.setStatus("approve");
    	Merchant merchant1=validateService.merchantValidation(merchant);
    	assertEquals("Approved", merchant1.getStatus());
*/    }
    
    @Test
    public void whenMerchantisDisapproved() {
    	
/*    	Merchant merchant=new Merchant();
    	merchant.setStatus("disapprove");
    	Merchant merchant1=validateService.merchantValidation(merchant);
    	assertEquals(null, merchant1);
*/    }
}
