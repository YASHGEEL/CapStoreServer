package com.capgemini.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.Merchant;





public interface ForgetPasswordMerchantRepository extends CrudRepository<Merchant,Integer>{

	
	
	@Query(value="SELECT m from Merchant m where m.email=(:email)")
	public Merchant findMerchant(@Param(value="email") String email);
	
	
	@Query("Select m.securityAnswer from Merchant m where m.email=:email")
	public String checkSecurityAnswerForMerchant(@Param("email") String email);
}
