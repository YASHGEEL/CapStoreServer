package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.Merchant;

public interface MerchantManageRepository extends JpaRepository<Merchant, Integer> {

	@Query ("select m from Merchant m where m.id=?1")
	public Merchant merchantdisplay(int id);
}
