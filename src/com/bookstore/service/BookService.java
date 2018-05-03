
package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Book;

public interface BookService {
	/*
	 * 发布新书
	 */
	public void bookPublish(Book book);
	/*
	 * 发布推荐图书
	 * 仅管理员可以
	 */
	public void addBookRecommended(Book book);
	/*
	 * 根据类别查询书籍
	 * 
	 */
	public List<Book> findBookByCategory(String category);
	/*
	 * 根据id查找图书
	 */
	public Book findBookById(int id);
	/*
	 * 查询所有和关键字有关的书
	 */
	public List<Book> findBookBySearch(String search);
}