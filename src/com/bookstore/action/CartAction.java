
package com.bookstore.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.springframework.format.annotation.DateTimeFormat;

import com.bookstore.entity.Book;
import com.bookstore.entity.Order_items;
import com.bookstore.entity.User;
import com.bookstore.service.BookService;
import com.bookstore.service.OrderService;
import com.bookstore.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport {
	private UserService userService;
	private BookService bookService;
	private OrderService orderService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@Override
	public String execute() throws Exception {
		Order_items order_items=new Order_items();
		HttpServletRequest request=ServletActionContext.getRequest();
		int book_id=Integer.parseInt(request.getParameter("id"));//书id
		Book book=bookService.findBookById(book_id);//获取书信息
		User user=userService.findUserById(book.getUser().getId());
		Date date=new Date();
		SimpleDateFormat sDateFormat1=new SimpleDateFormat("HHmmssSSS");
		SimpleDateFormat sDateFormat2=new SimpleDateFormat("yy-MM-dd-HH-mm-ss");
		HttpSession session=ServletActionContext.getRequest().getSession();
		int id=(int) session.getAttribute("id");
		System.out.println(id);
		//保存订单
		order_items.setOrder_num(sDateFormat1.format(date));//订单号
		order_items.setOrder_time(sDateFormat2.format(date));//订单时间
		order_items.setBook(book);//包含卖家信息
		order_items.setUser(userService.findUserById(id));
		order_items.setPrice(book.getPrice());
		order_items.setPay_state("未支付");
		order_items.setBook_name(book.getBook_name());
		order_items.setSell_name(user.getNickname());
		orderService.addOrder(order_items);
		//查询订单并保存到page域中
		List<Order_items> orders=orderService.findOrderById(id);
		ActionContext.getContext().put("order_items", orders);
		return SUCCESS;
	}
	public void validate() {
		if(ServletActionContext.getRequest().getSession().getAttribute("id")==null){
			addActionError("您还未登陆");
		}
	}
}