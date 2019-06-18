package com.capgemini.model;

import java.util.Date;

public class ReportViewMerchant {
	int merchantId;
	String merchantName;
	String phone;
	String address;
	int prodId;
	int custId;
	String status;
	Date date;
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public ReportViewMerchant() {
		super();
	}
	public ReportViewMerchant(int merchantId, String merchantName, String phone, String address, int prodId, int custId,
			String status, Date date) {
		super();
		this.merchantId = merchantId;
		this.merchantName = merchantName;
		this.phone = phone;
		this.address = address;
		this.prodId = prodId;
		this.custId = custId;
		this.status = status;
		this.date = date;
	}
	@Override
	public String toString() {
		return "ReportViewMerchant [merchantId=" + merchantId + ", merchantName=" + merchantName + ", phone=" + phone
				+ ", address=" + address + ", prodId=" + prodId + ", custId=" + custId + ", status=" + status
				+ ", date=" + date + "]";
	}
	
	
	
}
