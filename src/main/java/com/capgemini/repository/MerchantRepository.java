package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Merchant;
@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Integer>{
	
	@Query(value="select m from Merchant m where m.status=?1")
	public List<Merchant> getDetailsofMerchant(String status);
	
    /*@Query(value="update Merchant m SET m.status= :status WHERE m.id= :id")
    public void saveDetails(String status,int id);*/
}
