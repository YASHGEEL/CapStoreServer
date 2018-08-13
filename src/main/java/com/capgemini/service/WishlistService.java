package com.capgemini.service;

import com.capgemini.model.WishList;

public interface WishlistService {
	public abstract WishList add(WishList wishlist);
	
	public abstract WishList remove(WishList wishlist);
	
	public abstract WishList display(WishList wishlist);

}
