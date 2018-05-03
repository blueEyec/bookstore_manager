
package com.bookstore.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bookstore.dao.BookDao;
import com.bookstore.entity.Book;

public class BookDaoImpl extends HibernateDaoSupport implements BookDao {
	

	
	@Override
	public void addBook(Book book) {
		// TODO 自动生成的方法存根
		
		this.getHibernateTemplate().save(book);
		}

	@Override
	public List<Book> findBookByName(String name) {
		// TODO 自动生成的方法存根
		String hql="from Book b WHERE b.book_name=?";
		List<Book> books=(List<Book>) this.getHibernateTemplate().find(hql, name);
		return books;
	}

	public List<Book> findBookByCategory( String category) {
		String hql="from Book AS book WHERE book.category like '%"+category+"%'";
		List<Book> books=(List<Book>) this.getHibernateTemplate().find(hql);
		return books;
	}
	@Override
	public List<Book> findAllBook() {
		// TODO 自动生成的方法存根
		String hql="from Book book";
		List<Book> books=(List<Book>) this.getHibernateTemplate().find(hql);
		return books;
	}

	@Override
	public List<Book> findBookByAuthor(String book_author) {
		// TODO 自动生成的方法存根
		String hql="from Book b WHERE b.book_author=?";
		List<Book> books=(List<Book>) this.getHibernateTemplate().find(hql, book_author);
		return books;
	}

	@Override
	public void delBook() {
		// TODO 自动生成的方法存根

	}

	@Override
	public List<Book> findBookById(int id) {
		String hql="from Book AS book WHERE id=?";
		List<Book> books=(List<Book>) this.getHibernateTemplate().find(hql, id);
		return books;
	}

	

}