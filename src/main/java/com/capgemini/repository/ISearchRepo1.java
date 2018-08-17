package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;

public interface ISearchRepo1 extends JpaRepository<Merchant, Integer> {

	@Query(value = "select m from Merchant m where m.name= :searchString2")
	public Merchant findMerchant(@Param("searchString2") String searchString2);

}
