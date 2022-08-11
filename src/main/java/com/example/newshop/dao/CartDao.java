package com.example.newshop.dao;

import java.util.List;

import com.example.newshop.beans.CartBean;

public interface CartDao{
		
	public String addProductToCart(String userId, String prodId, int prodQty);
	
	public String updateProductToCart(String userId, String prodId, int prodQty);
	
	public List<CartBean> getAllCartItems(String userId);
	
	public int getCartCount(String userId);
	
	public String removeProductFromCart(String userId,String prodId);
	
	public boolean removeAProduct(String userId,String prodId);
	
}