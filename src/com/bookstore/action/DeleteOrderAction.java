
package com.bookstore.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.bookstore.entity.Book;
import com.bookstore.entity.Order_items;
import com.bookstore.service.BookService;
import com.bookstore.service.OrderService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DeleteOrderAction extends ActionSupport implements ModelDriven<Order_items> {
	public Order_items order_items;
	public OrderService orderService;
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public Order_items getModel() {
		// TODO 自动生成的方法存根
		return order_items;
	}
	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		//删除订单
		HttpServletRequest request=ServletActionContext.getRequest();
		int orderId=Integer.parseInt(request.getParameter("id"));
		orderService.deleteOrder(orderId);
		//显示订单
		int id=(int) ServletActionContext.getRequest().getSession().getAttribute("id");
		List<Order_items> orders=orderService.findOrderById(id);
		ActionContext.getContext().put("order_items", orders);
		return SUCCESS;
	}

}