package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Merchant;




@Repository
public interface ForgetPasswordMerchantRepository extends JpaRepository<Merchant,Integer>{

	
	
	@Query(value="SELECT m from Merchant m where m.email=(:email)")
	public Merchant findMerchant(@Param(value="email") String email);
	
	
	@Query("Select m.securityAnswer from Merchant m where m.email=:email")
	public String checkSecurityAnswerForMerchant(@Param("email") String email);
}
