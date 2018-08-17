package com.capgemini.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Discount 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	Date startTime;
	
	Date endTime;
	
	
	
	int discountPercentage;
	
	float discountedPrice;
	
	

	public float getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(float discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = Date.valueOf(LocalDate.now());
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	

	public Discount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Discount(int id, Date startTime, Date endTime,int discountPercentage,
			float discountedPrice) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		
		this.discountPercentage = discountPercentage;
		this.discountedPrice = discountedPrice;
	}

	@Override
	public String toString() {
		return "Discount [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", discountPercentage=" + discountPercentage + ", discountedPrice=" + discountedPrice + "]";
	}

	
	
	
}
