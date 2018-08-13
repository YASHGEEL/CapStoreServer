package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Admin;

@Repository
public interface SearchAdminRepository extends CrudRepository<Admin, Integer> {

}
