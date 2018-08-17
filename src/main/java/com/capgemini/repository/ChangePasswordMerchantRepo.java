package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Merchant;

@Repository
public interface ChangePasswordMerchantRepo extends JpaRepository<Merchant, Integer>{

	@Query("Select m from Merchant m where m.email = :email1")
	public Merchant getMerchant(@Param("email1") String email1);
	
}
