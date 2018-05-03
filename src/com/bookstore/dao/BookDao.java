
package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.Book;

public interface BookDao {
	//添加书籍
	void addBook(Book book);
	//根据书名查找书籍
	public List<Book> findBookByName(String name);
	//根据类别查找书籍
	public List<Book> findBookByCategory(String category);
	//根据作者查找书籍
	public List<Book> findBookByAuthor(String book_author);
	//删除书籍
	public void delBook();
	//查找所有书籍
	public List<Book> findAllBook();
	/*
	 * 根据id查找书籍
	 */
	public List<Book> findBookById(int id);
}