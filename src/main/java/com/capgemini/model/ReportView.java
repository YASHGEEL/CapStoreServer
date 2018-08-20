package com.capgemini.model;

import java.sql.Date;

public class ReportView {
	int pId;
	String pName;
	int orderId;
	int custId;
	String custName;
	String status;
	Date date;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public ReportView() {
		super();
	}
	@Override
	public String toString() {
		return "ReportView [pId=" + pId + ", pName=" + pName + ", orderId=" + orderId + ", custId=" + custId
				+ ", custName=" + custName + ", status=" + status + ", date=" + date + "]";
	}
	public ReportView(int pId, String pName, int orderId, int custId, String custName, String status, Date date) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.orderId = orderId;
		this.custId = custId;
		this.custName = custName;
		this.status = status;
		this.date = date;
	}
	public void setCustName(String custName) {
		this.custName = custName;
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
}
