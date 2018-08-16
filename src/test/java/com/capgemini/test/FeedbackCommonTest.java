package com.capgemini.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.model.Customer;
import com.capgemini.model.FeedBack;
import com.capgemini.model.Product;
import com.capgemini.repository.UserRepository;
import com.capgemini.service.FeedbackCommonService;
import com.capgemini.service.FeedbackCommonServiceImpl;

public class FeedbackCommonTest {

	FeedbackCommonService feedbackService;
	FeedBack feedback;
	
	@Mock
	UserRepository userRepository;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void GetCommentsFromCustomerToAdmin() {
		
		FeedBack feedback=new FeedBack();
		Product pro=new Product();
		feedback.setId(1);

		feedbackService.getComments(123);//123 is the productid
		
	}
	
	@Test(expected=NullPointerException.class)
	public void NoCommentsFromCustomer() {
	}
	
	
	@Test
	public void checkAdminForwardCommentToRespectiveMerchant() {
	}
	
	@Test(expected=NullPointerException.class)
	public void NotForwardedFromAdminToMerchant() {
		
	}
	
	
	@Test
	public void adminOrMerchantReply() {
		
	}
	
	@Test
	public void noReplyFromAdminOrMerchant() {
		
	}
	
	@Test
	public void checkProductIdMatchesWithCorrespondingMerchant() {
		
	}
	
	@Test
	public void responsePostedcorrectly() {
		
	}
	
	@Test
	public void validFeedbackId() {
		
	}
	
	
}
