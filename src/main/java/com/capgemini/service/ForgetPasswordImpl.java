package com.capgemini.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.InvalidEmailIdException;
import com.capgemini.exception.SecurityAnswerNotMatchedException;
import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.repository.ForgetPasswordCustomerRepository;
import com.capgemini.repository.ForgetPasswordMerchantRepository;

@Service("service")
public class ForgetPasswordImpl implements IForgetPassword {

	@Autowired
	ForgetPasswordCustomerRepository repo;

	@Autowired
	ForgetPasswordMerchantRepository repo1;

	public ForgetPasswordImpl(ForgetPasswordCustomerRepository repo, ForgetPasswordMerchantRepository repo1) {
		super();
		this.repo = repo;
		this.repo1 = repo1;
	}

	@Override
	@Transactional
	public Customer customerForgetPasswordEnterEmailId(String email) throws InvalidEmailIdException {

		System.out.println(email);

		Customer cust = repo.findCustomer(email);
		System.out.println(cust);

		if (cust != null)
			return (cust);
		else
			throw new InvalidEmailIdException(" Sorry Email Id not Found");

	}

	@Override
	@Transactional
	public Customer customerForgetPasswordEnterAnswer(Customer customer, String securityAnswer)
			throws SecurityAnswerNotMatchedException {

		String ans = repo.checkSecurityAnswer(customer.getEmail());
		if (ans.equals(securityAnswer)) {
			System.out.println("found correct answer");
			return customer;
		} else {

			throw new SecurityAnswerNotMatchedException("Wrong Security Answer");
		}

	}

	@Override
	@Transactional
	public String customerForgetPasswordChangeNewPassword(Customer customer, String newpassword) {

		customer.setPassword(newpassword);
		Customer output = repo.save(customer);
		System.out.println(output);
		{
			if (output != null)

			{
				return "updated new password";

			} else {
				return "Not Updated";
			}
		}

	}

	
	@Override
	public Merchant merchantForgetPasswordEnterEmailId(String email) throws InvalidEmailIdException {
		System.out.println(email);
	Merchant merchant=repo1.findMerchant(email);
	
	System.out.println(merchant);
	if(merchant!=null)
	{
		return merchant;
	}
	else
	{
		throw new InvalidEmailIdException("Sorry Wrong Email");
	}
		
	}


	@Override
	@Transactional
	public Merchant merchantForgetPasswordEnterAnswer(Merchant merchant, String securityAnswer)
			throws SecurityAnswerNotMatchedException {
		System.out.println("From service merch " + merchant);
		String ans = repo1.checkSecurityAnswerForMerchant(merchant.getEmail());
		if (ans.equals(securityAnswer)) {
			System.out.println("found correct answer");
			return merchant;
		} else {
			throw new SecurityAnswerNotMatchedException("Wrong Security Answer");
		}

	}

	@Override
	@Transactional
	public String merchantForgetPasswordChangeNewPassword(Merchant merchant, String newpassword) {

		merchant.setPassword(newpassword);
		Merchant output = repo1.save(merchant);
		System.out.println(output);
		{
			if (output != null)

			{
				return "updated new password";

			} else {
				return "Not Updated";
			}
		}
	}


}
