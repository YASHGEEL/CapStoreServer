package com.capgemini.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Merchant 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	Date startTime;

	Date endTime;

	String name;

	String address;

	String phone;
	
	String status;

	String email;

	String password;

	String securityQuestion;

	String securityAnswer;

	String imageUrl;
	
	float averageRating;
	
	@OneToMany(targetEntity=Product.class)
	List product;

	
	
	
	public float getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}

	public List getProduct() {
		return product;
	}

	public void setProduct(List product) {
		this.product = product;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Merchant(int id, Date startTime, Date endTime, String name, String address, String phone, String status,
			String email, String password, String securityQuestion, String securityAnswer, String imageUrl,
			float averageRating, List product) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.status = status;
		this.email = email;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.imageUrl = imageUrl;
		this.averageRating = averageRating;
		this.product = product;
	}

	@Override
	public String toString() {
		return "Merchant [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", name=" + name
				+ ", address=" + address + ", phone=" + phone + ", status=" + status + ", email=" + email
				+ ", password=" + password + ", securityQuestion=" + securityQuestion + ", securityAnswer="
				+ securityAnswer + ", imageUrl=" + imageUrl + ", averageRating=" + averageRating + ", product="
				+ product + "]";
	}


	

}
