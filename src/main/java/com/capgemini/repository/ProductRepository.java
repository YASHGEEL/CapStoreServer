package com.capgemini.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.capgemini.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

@Query(value="select p from Product p where p.startTime Between (?1) And ?1")
public  List<Product> newProducts(Date date); 
}
