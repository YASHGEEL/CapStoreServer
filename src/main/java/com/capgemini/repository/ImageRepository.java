package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;
import com.capgemini.model.Product;

public interface ImageRepository extends CrudRepository<Product, Integer> {

}
