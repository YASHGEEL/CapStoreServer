package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.model.FeedBack;
import com.capgemini.model.Merchant;
import com.capgemini.model.Product;



public interface RatingRepository extends JpaRepository<FeedBack,Integer> {

	@Query(value = "SELECT feed_back.rating FROM feed_back  WHERE feed_back.id=?1",nativeQuery=true)
	public int getFeedback(int pId);
	
	@Query(value = "SELECT feedback_id FROM product_feedback  WHERE product_id=?1",nativeQuery=true)
	public List<Integer> getFeedbackIds(int pId);

	


	

	@Query(value = "SELECT p FROM Product p INNERJOiN Merchant ON Merchant.id",nativeQuery=true)
	public List<Product> getProductList(@Param(value = "id") int mId);

}