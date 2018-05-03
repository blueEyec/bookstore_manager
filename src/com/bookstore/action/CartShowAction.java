
package com.bookstore.action;

import java.util.List;
import org.apache.struts2.ServletActionContext;
import com.bookstore.entity.Order_items;
import com.bookstore.entity.User;
import com.bookstore.service.OrderService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class CartShowAction extends ActionSupport implements ModelDriven<User>{
	public User user ;
	public OrderService orderService;
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	@Override
	public User getModel() {
		// TODO 自动生成的方法存根
		return user;
	}
	@Override
	public String execute() throws Exception {
		int id=(int) ServletActionContext.getRequest().getSession().getAttribute("id");
		List<Order_items> orders=orderService.findOrderById(id);
		if(orders.size()==0){
			return SUCCESS;
		}
		ActionContext.getContext().put("order_items", orders);
		return SUCCESS;
	}
	@Override
	public void validate() {
		if(ServletActionContext.getRequest().getSession().getAttribute("id")==null){
			addActionError("您还未登陆");
		}
	}
	
	
	
}