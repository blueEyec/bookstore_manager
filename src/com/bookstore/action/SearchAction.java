package com.bookstore.action;

import java.util.List;

import com.bookstore.entity.Book;
import com.bookstore.service.BookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport {
	private String search;
	public BookService bookService;
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getSearch() {
		return search;
	}
	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		List<Book> books=bookService.findBookBySearch(search);
		ActionContext.getContext().put("books", books);
		return SUCCESS;
	}

}
