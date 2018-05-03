
package com.bookstore.dao.impl;

import java.util.List;


import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bookstore.dao.OrderDao;
import com.bookstore.entity.Order_items;

public class OrderDaoImpl extends HibernateDaoSupport implements OrderDao {
	
	@Override
	public void addOrder(Order_items order_items) {
		this.getHibernateTemplate().save(order_items);
	}
	@Override
	public List<Order_items> findOrderById(int id) {
		// TODO 自动生成的方法存根
		String hql="from Order_items o where id=?";
		List<Order_items> order_items=(List<Order_items>) this.getHibernateTemplate().find(hql, id);
		return order_items;
	}
	@Override
	public void deleteOrderByOrder(List<Order_items> order_items) {
		// TODO 自动生成的方法存根
		this.getHibernateTemplate().delete(order_items.get(0));
	}

	@Override
	public List<Order_items> findOrderByBuyId(int user_id) {
		// TODO 自动生成的方法存根
		String hql="from Order_items o WHERE o.user.id=?";
		List<Order_items> order_items= (List<Order_items>) this.getHibernateTemplate().find(hql, user_id);
		return order_items;
	}
	

	

}