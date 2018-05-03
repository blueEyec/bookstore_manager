
package com.bookstore.service;

import java.util.List;


import com.bookstore.entity.Order_items;

public interface OrderService {
	/*
	 * 添加订单
	 */
	public void addOrder(Order_items order_items);
	/*
	 * 根据订单id删除订单
	 */
	public void deleteOrder(int id);
	/*
	 * 根据用户id查询订单
	 */
	public List<Order_items> findOrderById(int user_id);
}