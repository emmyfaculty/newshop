package com.example.newshop.dao;

import java.util.List;

import com.example.newshop.beans.OrderBean;
import com.example.newshop.beans.TransactionBean;

public interface OrderDao {
	
	public String paymentSuccess(String userName,double paidAmount);

	public boolean addOrder(OrderBean order);
	
	public boolean addTransaction(TransactionBean transaction);
	
	public int countSoldItem(String prodId);
	
	public List<OrderBean> getAllOrders();
}
