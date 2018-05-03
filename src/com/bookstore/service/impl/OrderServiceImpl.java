
package com.bookstore.service.impl;

import java.util.List;

import javax.persistence.criteria.Order;

import com.bookstore.dao.OrderDao;
import com.bookstore.entity.Order_items;
import com.bookstore.service.OrderService;

public class OrderServiceImpl implements OrderService {

	public OrderDao orderDao;
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	@Override
	public void addOrder(Order_items order_items) {
		// TODO 自动生成的方法存根
		orderDao.addOrder(order_items);
	}

	@Override
	public void deleteOrder(int id) {
		// TODO 自动生成的方法存根
		List<Order_items> order_items=orderDao.findOrderById(id);
		orderDao.deleteOrderByOrder(order_items);
	}
	@Override
	public List<Order_items> findOrderById(int user_id) {
		List<Order_items> order=(List<Order_items>) orderDao.findOrderByBuyId(user_id);
		return order;
	}

}