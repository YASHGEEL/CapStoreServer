package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.Product;
import com.capgemini.model.WishList;

public interface WishlistRepository extends JpaRepository<WishList, Integer> {

   
}
