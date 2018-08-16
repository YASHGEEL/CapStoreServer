package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.PromoCode;

public interface PromoRepository extends JpaRepository<PromoCode, Integer> {

	@Query("select p from PromoCode p where p.name=?1")
	PromoCode getPromoCode(String promoname);
	

}
