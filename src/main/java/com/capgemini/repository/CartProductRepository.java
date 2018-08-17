package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.Cart;
import com.capgemini.model.Product;

public interface CartProductRepository extends JpaRepository<Product, Integer> {

}
