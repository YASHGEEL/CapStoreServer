package com.capgemini.service;

public interface FeedbackCommon {

	public void getComments(String message);
	
	public void forwardToMerchant(String forwardMessage);
	
	public void responseFromMerchant(String responseMessage);

}
