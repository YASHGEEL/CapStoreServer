package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.model.WishList;

public interface WishlistRepository extends JpaRepository<WishList, Integer> {

}
