package com.bookstore.action;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.apache.struts2.ServletActionContext;

import com.bookstore.entity.Book;
import com.bookstore.entity.Recommended;
import com.bookstore.entity.User;
import com.bookstore.service.BookService;
import com.bookstore.service.RecommendedService;
import com.bookstore.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RecommendedAction extends ActionSupport {
	public Recommended recommended=new Recommended();
	public BookService bookService;
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public RecommendedService recommendedService;
	public void setRecommendedService(RecommendedService recommendedService) {
		this.recommendedService = recommendedService;
	}
	public UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		
		
		int book_id=Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		
		Book book=bookService.findBookById(book_id);
		
		int id=(int) ServletActionContext.getRequest().getSession().getAttribute("id");
		
		User user=userService.findUserById(id);
		if(user.getIntegral()<100&&user.getPermission()==0){
			addActionError("您的积分不够，不能推荐书籍");
			return ERROR;
		}
		
		recommended.setBook(book);
		recommended.setBook_author(book.getBook_name());
		recommended.setBook_name(book.getBook_name());
		recommended.setCategory(book.getCategory());
		recommended.setBook_picture(book.getBook_picture());
		recommended.setDescription(book.getDescription());
		recommended.setInventory(book.getInventory());
		recommended.setPrice(book.getPrice());
		recommended.setUser(user);
		recommendedService.addRecommended(recommended);
		return SUCCESS;
	}
	public void validate() {
		if(ServletActionContext.getRequest().getSession().getAttribute("id")==null){
			addActionError("您还未登陆");
		}
		
	}

}
