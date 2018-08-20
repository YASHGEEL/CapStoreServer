package com.capgemini.model;

import java.util.List;

public interface IDisplayProductUtil {

	int getId();

	String getName();

	String getBrand();

	String getDescription();

	float getCost();

	String getStatus();

	int getQuantity();

	String getImageUrl();

	int getViewCount();

	float getAverageRating();

	CategoryData getCategory();

	List<FeedBackData> getFeedback();

	interface CategoryData {

		int getId();

		String getName();
	}

	interface FeedBackData {

		int getId();

		CustomerData getCustomer();

		String getComment();

		String getFeedbackResponse();

		int getRating();

	}

	interface CustomerData {

		int getId();

		String getName();

		String getEmail();

		String getImageUrl();
	}

}
