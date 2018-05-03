
package com.bookstore.service.impl;

import java.util.List;
import java.util.Map;

import com.bookstore.dao.BookDao;
import com.bookstore.entity.Book;
import com.bookstore.service.BookService;

public class BookServiceImpl implements BookService {
	
	public BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public void bookPublish(Book book) {
		// TODO 自动生成的方法存根
		bookDao.addBook(book);
	}

	@Override
	public void addBookRecommended(Book book) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public  List<Book> findBookByCategory(String category) {
		// TODO 自动生成的方法存根
		
		if("全部商品".equals(category)){
			List<Book> books=bookDao.findAllBook();
			return books;
		}else 
		{
			List<Book> books =bookDao.findBookByCategory(category);
			if(books.size()!=0){
				return books;
			}
		}
		return null;
		
	}

	@Override
	public Book findBookById(int id) {
		List<Book> books=(List<Book>) bookDao.findBookById(id);
		Book book=new Book();
		book.setBook_author(books.get(0).getBook_author());
		book.setBook_name(books.get(0).getBook_name());
		book.setBook_picture(books.get(0).getBook_picture());
		book.setUser(books.get(0).getUser());
		book.setId(books.get(0).getId());
		book.setPrice(books.get(0).getPrice());
		book.setCategory(books.get(0).getCategory());
		book.setInventory(books.get(0).getInventory());
		book.setDescription(books.get(0).getDescription());
		return book;
	}

	@Override
	public List<Book> findBookBySearch(String search) {
		// TODO 自动生成的方法存根
		List<Book> books=bookDao.findBookByName(search);
		List<Book> book1=bookDao.findBookByAuthor(search);
		List<Book> book2=bookDao.findBookByCategory(search);
		books.addAll(book1);
		books.addAll(book2);
		return books;
	}

}