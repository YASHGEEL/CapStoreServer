package com.capgemini.model;

public class InvoiceView {

	int orderId;
	float orderAmount;
	int orderQuantity;
	int prodId;
	String productName;
	String productBrand;
	float productCost;
	float discountedPrice;

	public float getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(float discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	String custName;
	String custAddress;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public float getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public float getProductCost() {
		return productCost;
	}

	public void setProductCost(float productCost) {
		this.productCost = productCost;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public InvoiceView(int orderId, float orderAmount, int orderQuantity, int prodId, String productName,
			String productBrand, float productCost, float discountedPrice, String custName, String custAddress) {
		super();
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderQuantity = orderQuantity;
		this.prodId = prodId;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productCost = productCost;
		this.discountedPrice = discountedPrice;
		this.custName = custName;
		this.custAddress = custAddress;
	}

	public InvoiceView() {
		super();
		// TODO Auto-generated constructor stub
	}

}
