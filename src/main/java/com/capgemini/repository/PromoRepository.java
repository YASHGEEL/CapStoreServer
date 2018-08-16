package com.capgemini.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.PromoCode;

public interface PromoRepository extends JpaRepository<PromoCode, Integer>{
	@Query(value="select p from PromoCode p")
	public  List<PromoCode> newPromos();
	
}
