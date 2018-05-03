package com.bookstore.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import javax.xml.crypto.Data;

import org.apache.struts2.ServletActionContext;

import com.bookstore.entity.Book;
import com.bookstore.service.BookService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class BookShowAction extends ActionSupport implements ModelDriven<Book>{
	public Book book=new Book();


	public BookService bookService;
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	@Override
	public Book getModel() {
		// TODO 自动生成的方法存根
		return book;
	}
	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		
		List<Book> books=bookService.findBookByCategory(book.getCategory());
		ActionContext.getContext().put("books", books);
		return SUCCESS;
	}

	


	
}