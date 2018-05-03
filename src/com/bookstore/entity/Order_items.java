
package com.bookstore.entity;

import java.sql.Timestamp;

/*
 * CREATE TABLE order_items(
id int(10) AUTO_INCREMENT,
order_num int(15),
buy_id int(10),

book_id int(10),
pay_state varchar(10),
order_time DATETIME,
price DOUBLE,
FOREIGN KEY(buy_id) REFERENCES user(id),

FOREIGN KEY(book_id) REFERENCES book(id),
PRIMARY KEY(id,order_num)
);

 */
public class Order_items {
	private int id;
	private String order_num;
//	private int buy_id;
//	private int sell_id;
//	private int book_id;
	private String pay_state;
	private String order_time;
	private double price;
	private String book_name;
	private String sell_name;
	private Book book;
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrder_num() {
		return order_num;
	}
	public void setOrder_num(String order_num) {
		this.order_num = order_num;
	}
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getSell_name() {
		return sell_name;
	}
	public void setSell_name(String sell_name) {
		this.sell_name = sell_name;
	}
	public String getPay_state() {
		return pay_state;
	}
	public void setPay_state(String pay_state) {
		this.pay_state = pay_state;
	}
	public String getOrder_time() {
		return order_time;
	}
	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}