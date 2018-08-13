package com.capgemini.service;

import com.capgemini.model.Admin;
import com.capgemini.model.Merchant;

public interface ImageService {
	
	public Merchant addImage(String imageUrl);
	
	public Admin approveImage(String imageUrl);

}
