package com.bookstore.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.bookstore.entity.Book;
import com.bookstore.entity.User;
import com.bookstore.service.BookService;
import com.bookstore.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BookPublishAction extends ActionSupport implements ModelDriven<Book> {
	private Book book=new Book();
	public BookService bookService;
	public UserService userService;
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public Book getModel() {
		// TODO 自动生成的方法存根
		return book;
	}



	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		int id=(int) ServletActionContext.getRequest().getSession().getAttribute("id");
		User user=userService.findUserById(id);
		book.setUser(user);
		bookService.bookPublish(book);
		System.out.println("新书发布成功");
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("book_name", book.getBook_name());
		session.setAttribute("book_author", book.getBook_author());
		session.setAttribute("picture", book.getBook_picture());
		session.setAttribute("price", book.getPrice());
		session.setAttribute("category", book.getCategory());
		session.setAttribute("description", book.getDescription());
		session.setAttribute("inventory", book.getInventory());
		
		return SUCCESS;
	}
	@Override
	public void validate() {
		if(ServletActionContext.getRequest().getSession().getAttribute("id")==null){
			addActionError("您还未登陆");
		}
	}
	
	
}