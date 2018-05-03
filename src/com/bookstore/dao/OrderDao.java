
package com.bookstore.dao;

import java.util.List;
import com.bookstore.entity.Order_items;

public interface OrderDao {
	/*
	 * 增加订单
	 */
	public void addOrder(Order_items order_items);
	/*
	 * 根据用户id查看订单
	 */
	public List<Order_items> findOrderByBuyId(int user_id);
	/*
	 * 删除订单
	 */
	public void deleteOrderByOrder(List<Order_items> order_items);
	/*
	 * 根据id查订单
	 */
	public List<Order_items> findOrderById(int id);
}