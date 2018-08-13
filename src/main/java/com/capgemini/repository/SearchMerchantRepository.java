package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Merchant;

@Repository
public interface SearchMerchantRepository extends CrudRepository<Merchant, Integer> {

}
