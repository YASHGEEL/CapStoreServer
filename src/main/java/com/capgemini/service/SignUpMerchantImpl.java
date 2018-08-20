package com.capgemini.service;

import java.sql.Date;
import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.repository.SignUpMerchantRepository;

@Service
public class SignUpMerchantImpl implements signUpMerchant {
	@Autowired
	public SignUpMerchantRepository repo;

	@Transactional
	@Override
	public String addMerchant(Merchant merchant) {
		merchant.setStartTime(Date.valueOf(LocalDate.now()));
		merchant.setStatus("Not Approved");
		Merchant merc1 = repo.getMerchantPhone(merchant.getPhone());
		Merchant merc = repo.getMerchant(merchant.getEmail());

		if (merc1 == null) {
			boolean status = validatePhone(merchant.getPhone());
			if (status == true) {
				if (merc == null) {
					repo.save(merchant);
					return null;
				} else {
					return "Merchant with provided e-mail already exists";
				}
			}
			return null;
		} else {
			return "Merchant with provided phone number already exists";
		}
	}

	public boolean validatePhone(String phone) {
		if (phone.matches("[6-9][0-9]{9}")) {
			return true;
		} else
			return false;
	}
}
