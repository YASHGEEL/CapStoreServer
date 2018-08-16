package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.FeedBack;

public interface FeedbackCommonRepository extends JpaRepository<FeedBack,Integer>{

	@Query("Select f from FeedBack f where f.id=?1")
	public FeedBack getComments(int id);
	
}
