package com.capgemini.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.InvalidEmailIdException;
import com.capgemini.exception.SecurityAnswerNotMatchedException;

public class testForgetPassword {

	
	@Before
	public void setUp() {
		
	}
	
	
 /*Following are the Test Cases For Customer Model
  * 1.When Email Id is invalid or null
  * 2.When  Email Id is Valid
  * 3.When Security Answer Is Invalid
  * 4.When Security Answer Is Valid
  * 5.When New Password Is Invalid
  * 6.When New Password Is Valid
  *	*/
@Test(expected=NullPointerException.class)
public void whenForgetPasswordEmailIdDoesNotExistForCustomer() throws NullPointerException
{
	
}
	


@Test
public void whenForgetPasswordEmailIdIsValidForCustomer()
{
	
	
	
}

@Test(expected=NullPointerException.class)
public void whenSecurityAnswerDoesNotExistForCustomer() throws NullPointerException
{
	
}



@Test
public void whenSecurityAnswerIsValidForCustomer()
{
	
	
	
}

@Test(expected=NullPointerException.class)
public void whenNewPasswordIsInvalidForCustomer() throws NullPointerException
{
	
}


@Test
public void whenNewPasswordIsValidForCustomer() 
{
	
}



/*Following are the Test Cases For Merchant Model
 * 1.When Email Id is invalid or null
  * 2.When  Email Id is Valid
  * 3.When Security Answer Is Invalid
  * 4.When Security Answer Is Valid
  * 5.When New Password Is Invalid
  * 6.When New Password Is Valid
*/
@Test(expected=NullPointerException.class)
public void whenForgetPasswordEmailIdDoesNotExistForMerchant() throws NullPointerException
{
	
}
	


@Test
public void whenForgetPasswordEmailIdIsValidForMerchant()
{
	
	
	
}

@Test(expected=NullPointerException.class)
public void whenSecurityAnswerDoesNotExistForMerchant() throws NullPointerException
{
	
}



@Test
public void whenSecurityAnswerIsValidForMerchant()
{
	
	
	
}

@Test(expected=NullPointerException.class)
public void whenNewPasswordIsInvalidForMerchant() throws NullPointerException
{
	
}


@Test
public void whenNewPasswordIsValidForMerchant() 
{
	
}

@After
public void close()
{
	
}
	
}
