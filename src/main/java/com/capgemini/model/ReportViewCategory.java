package com.capgemini.model;

import java.sql.Date;

public class ReportViewCategory {
	int catId;
	String catName;
	int prodId;
	String prodName;
	int custId;
	String status;
	Date date;
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ReportViewCategory() {
		super();
	}
	public ReportViewCategory(int catId, String catName, int prodId, String prodName, int custId, String status,
			Date date) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.prodId = prodId;
		this.prodName = prodName;
		this.custId = custId;
		this.status = status;
		this.date = date;
	}
	@Override
	public String toString() {
		return "ReportViewCategory [catId=" + catId + ", catName=" + catName + ", prodId=" + prodId + ", prodName="
				+ prodName + ", custId=" + custId + ", status=" + status + ", date=" + date + "]";
	}
	
	
	
}
