package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.FeedBack;
import com.capgemini.model.Merchant;
import com.capgemini.model.Product;

public interface RatingRepository extends JpaRepository<FeedBack, Integer> {

	
	@Query(value = "SELECT feed_back.rating FROM feed_back  WHERE feed_back.id=?1", nativeQuery = true)
	public int getFeedback(int fId);

	@Query(value = "SELECT feedback_id FROM product_feedback  WHERE product_id=?1", nativeQuery = true)
	public List<Integer> getFeedbackIds(int pId);

	@Query(value = "SELECT product_id FROM merchant_product WHERE merchant_id=?1", nativeQuery = true)
	public List<Integer> getProductList(int mId);

	@Query(value = "SELECT product.average_rating FROM product WHERE product.id=?1", nativeQuery = true)
	public float getProductAvgRating(int pId);

	public Product save(Product product);

	@Query("select product from Product product where product.id=?1")
	public Product findProduct(int pId);

	public Merchant save(Merchant merchant);

	@Query("select merchant from Merchant merchant where merchant.id=?1")
	public Merchant findMerchant(float avgRating);

}