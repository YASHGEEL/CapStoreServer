package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.Category;

public interface CategoryInventoryRepository extends JpaRepository<Category, Integer>{

}
