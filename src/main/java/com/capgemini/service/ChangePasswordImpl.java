package com.capgemini.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capgemini.exception.OldPasswordNotFoundExcepetion;
import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.repository.ChangePasswordCustomerRepo;
import com.capgemini.repository.ChangePasswordMerchantRepo;
import com.capgemini.repository.UserRepository;

@Service("service")
public class ChangePasswordImpl implements IChangePassword{

	@Autowired
	ChangePasswordCustomerRepo repoCustomer;
	
	@Autowired
	ChangePasswordMerchantRepo repoMerchant;	
	
	
	public ChangePasswordImpl(ChangePasswordCustomerRepo repoCustomer,ChangePasswordMerchantRepo repoMerchant) {
		this.repoCustomer=repoCustomer;
		this.repoMerchant=repoMerchant;
	}
		

	@Override	
	@Transactional
	public String changePasswordForCustomer(String email, String oldPassword, String newPassword) throws OldPasswordNotFoundExcepetion{
		
		System.out.println("from service "+email);
		Customer customer=repoCustomer.getCustomer(email);
		System.out.println("from service "+customer);
		if(customer.getPassword().equals(oldPassword))
		{
			if(oldPassword.equals(newPassword))
			{
				throw new OldPasswordNotFoundExcepetion("New Password cannot be same as Old Password");
			}
			else
			{
				customer.setPassword(newPassword);
				Customer cust=repoCustomer.save(customer);
				System.out.println(cust);
				return "New Password Updated Successfully!";
			}						
		}
		else
			throw new OldPasswordNotFoundExcepetion("New Password Not Updated!");		
	}

	@Override
	@Transactional
	public String changePasswordForMerchant(String email, String oldPassword, String newPassword) throws OldPasswordNotFoundExcepetion
	{
		Merchant merchant=repoMerchant.getMerchant(email);
		if(merchant.getPassword().equals(oldPassword))
		{
			if(oldPassword.equals(newPassword))
			{
				throw new OldPasswordNotFoundExcepetion("New Password cannot be same as Old Password");
			}
			else
			{
				merchant.setPassword(newPassword);
				Merchant merch=repoMerchant.save(merchant);			
				return "New Password Updated Successfully!";
			}			
		}
		else
			throw new OldPasswordNotFoundExcepetion("New Password Not Updated!");
	}

	
	
}
