package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.InvalidEmailIdException;
import com.capgemini.exception.SecurityAnswerNotMatchedException;
import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.repository.ForgetPasswordCustomerRepository;
import com.capgemini.repository.ForgetPasswordMerchantRepository;
import com.capgemini.service.ForgetPasswordImpl;
import com.capgemini.service.IForgetPassword;

public class testForgetPassword {

	IForgetPassword forgetService;
	
	@Mock
	ForgetPasswordCustomerRepository repo;
	
	@Mock
	ForgetPasswordMerchantRepository repo1;
	
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		forgetService=new ForgetPasswordImpl(repo,repo1);
		
	}
	
	
 /*Following are the Test Cases For Customer Model
  * 1.When Email Id is invalid or null
  * 2.When  Email Id is Valid
  * 3.When Security Answer Is Invalid
  * 4.When Security Answer Is Valid
  * 5.When New Password Is Invalid
  * 6.When New Password Is Valid
  *	*/
@Test(expected=InvalidEmailIdException.class)
public void whenForgetPasswordEmailIdDoesNotExistForCustomer() throws NullPointerException, InvalidEmailIdException
{
	
	Customer customer=new Customer(1, null, null, "vaishnavi","Nagpur" , "9876543210", "v@gmail.com", "123", null, null, "what is your name?", "geeta", null);
	when(repo.findCustomer(customer.getEmail())).thenReturn(customer);
	forgetService.customerForgetPasswordEnterEmailId("vuyuy@gmail.com");
	
}
	


@Test
public void whenForgetPasswordEmailIdIsValidForCustomer()
{
	Customer customer=new Customer(1, null, null, "vaishnavi","Nagpur" , "9876543210", "v@gmail.com", "123", null, null, "what is your name?", "geeta", null);
	when(repo.findCustomer("v@gmail.com")).thenReturn(customer);
	assertEquals(customer.getEmail(),"v@gmail.com" );
}

@Test(expected=SecurityAnswerNotMatchedException.class)
public void whenSecurityAnswerDoesNotExistForCustomer() throws NullPointerException, SecurityAnswerNotMatchedException
{
	Customer customer=new Customer(1, null, null, "vaishnavi","Nagpur" , "9876543210", "v@gmail.com", "123", null, null, "what is your name?", "geeta", null);
	when(repo.checkSecurityAnswer(customer.getEmail())).thenReturn("geeta");
	
	forgetService.customerForgetPasswordEnterAnswer(customer,"geet");
	
	
}



@Test
public void whenSecurityAnswerIsValidForCustomer() throws SecurityAnswerNotMatchedException
{
	Customer customer=new Customer(1, null, null, "vaishnavi","Nagpur" , "9876543210", "v@gmail.com", "123", null, null, "what is your name?", "geeta", null);
	when(repo.checkSecurityAnswer(customer.getEmail())).thenReturn("geeta");
	Customer customer1=	forgetService.customerForgetPasswordEnterAnswer(customer,"geeta");
	
	assertEquals(customer, customer1);
	
	
	
}

@Test
public void whenNewPasswordIsInvalidForCustomer() throws NullPointerException
{
	Customer customer=new Customer(1, null, null, "vaishnavi","Nagpur" , "9876543210", "v@gmail.com", "123", null, null, "what is your name?", "geeta", null);
	when(repo.save(customer)).thenReturn(null);
	String s=forgetService.customerForgetPasswordChangeNewPassword(customer, "hg");
	assertEquals("Not Updated", s);
	
}


@Test
public void whenNewPasswordIsValidForCustomer() 
{
	Customer customer=new Customer(1, null, null, "vaishnavi","Nagpur" , "9876543210", "v@gmail.com", "123", null, null, "what is your name?", "geeta", null);
	when(repo.save(customer)).thenReturn(customer);
	String s=forgetService.customerForgetPasswordChangeNewPassword(customer, "done");
	assertEquals("updated new password", s);
	
	
}



/*Following are the Test Cases For Merchant Model
 * 1.When Email Id is invalid or null
  * 2.When  Email Id is Valid
  * 3.When Security Answer Is Invalid
  * 4.When Security Answer Is Valid
  * 5.When New Password Is Invalid
  * 6.When New Password Is Valid
*/
@Test(expected=InvalidEmailIdException.class)
public void whenForgetPasswordEmailIdDoesNotExistForMerchant() throws NullPointerException, InvalidEmailIdException
{
	
	Merchant merchant=new Merchant(2, null, null, "vaishnavi", "Pune", "9876543210", null, "vaishnavi@gmail.com", "12345", "what is your name?", "vilas", null, 5, null);
	when(repo1.findMerchant(merchant.getEmail())).thenReturn(merchant);
	forgetService.merchantForgetPasswordEnterEmailId("vaishn@gmail.com");
}
	


@Test
public void whenForgetPasswordEmailIdIsValidForMerchant()
{
	
	Merchant merchant=new Merchant(2, null, null, "vaishnavi", "Pune", "9876543210", null, "vaishnavi@gmail.com", "12345", "what is your name?", "vilas", null, 5, null);
	when(repo1.findMerchant(merchant.getEmail())).thenReturn(merchant);
	assertEquals(merchant.getEmail(), "vaishnavi@gmail.com");
	
}

@Test(expected=SecurityAnswerNotMatchedException.class)
public void whenSecurityAnswerDoesNotExistForMerchant() throws NullPointerException, SecurityAnswerNotMatchedException
{
	Merchant merchant=new Merchant(2, null, null, "vaishnavi", "Pune", "9876543210", null, "vaishnavi@gmail.com", "12345", "what is your name?", "vilas", null, 5, null);
	when(repo1.checkSecurityAnswerForMerchant(merchant.getEmail())).thenReturn("vilas");
	forgetService.merchantForgetPasswordEnterAnswer(merchant, "vil");
	
}



@Test
public void whenSecurityAnswerIsValidForMerchant() throws SecurityAnswerNotMatchedException
{
	
	Merchant merchant=new Merchant(2, null, null, "vaishnavi", "Pune", "9876543210", null, "vaishnavi@gmail.com", "12345", "what is your name?", "vilas", null, 5, null);
	when(repo1.checkSecurityAnswerForMerchant(merchant.getEmail())).thenReturn("vilas");
	Merchant merchant1=forgetService.merchantForgetPasswordEnterAnswer(merchant, "vilas");
	assertEquals(merchant,merchant1);
	
}

@Test
public void whenNewPasswordIsInvalidForMerchant() throws NullPointerException
{
	Merchant merchant=new Merchant(2, null, null, "vaishnavi", "Pune", "9876543210", null, "vaishnavi@gmail.com", "12345", "what is your name?", "vilas", null, 5, null);
	when(repo1.save(merchant)).thenReturn(null);
	String s=forgetService.merchantForgetPasswordChangeNewPassword(merchant, "doneFinally");
	assertEquals("Not Updated", s);
}


@Test
public void whenNewPasswordIsValidForMerchant() 
{
	
	Merchant merchant=new Merchant(2, null, null, "vaishnavi", "Pune", "9876543210", null, "vaishnavi@gmail.com", "12345", "what is your name?", "vilas", null, 5, null);
	when(repo1.save(merchant)).thenReturn(merchant);
	String s=forgetService.merchantForgetPasswordChangeNewPassword(merchant, "doneFinally");
	assertEquals("updated new password", s);
}

@After
public void close()
{
	
}
	
}
