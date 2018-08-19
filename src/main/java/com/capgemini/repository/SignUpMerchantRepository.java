package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.Merchant;

public interface SignUpMerchantRepository extends JpaRepository<Merchant, Integer> {
	@Query(value = " Select m From Merchant m where m.email=?1")
	public Merchant getMerchant(String email);

	@Query(value = "Select m from Merchant m where m.phone=?1")
	public Merchant getMerchantPhone(String phone);

}
