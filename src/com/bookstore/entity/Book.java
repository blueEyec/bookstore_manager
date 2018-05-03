package com.bookstore.entity;

import java.util.HashSet;
import java.util.Set;

/*
 * 
CREATE TABLE book(
id int(10) AUTO_INCREMENT ,
user_id int(10),
book_name varchar(20) NOT NULL,
book_author varchar(20),
category varchar(20),
book_picture varchar(30),
price DOUBLE,
description varchar(50),
inventory int(10),
PRIMARY KEY(id),
FOREIGN KEY(user_id) REFERENCES user(id)
);
 */
public class Book {
	private int id;
//	private int user_id;
	private String book_name;
	private String book_author;
	private String category;
	private String book_picture;
	private double price;
	private String description;
	private int inventory;
	private User user;
	private Set<Order_items> order_items=new HashSet<Order_items>();
	private Set<Recommended> recommendeds=new HashSet<Recommended>();
	private Set<Evaluation> evaluations=new HashSet<Evaluation>();
	
	public Set<Evaluation> getEvaluations() {
		return evaluations;
	}
	public void setEvaluations(Set<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<Order_items> getOrder_items() {
		return order_items;
	}
	public void setOrder_items(Set<Order_items> order_items) {
		this.order_items = order_items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public int getUser_id() {
//		return user_id;
//	}
//	public void setUser_id(int user_id) {
//		this.user_id = user_id;
//	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBook_picture() {
		return book_picture;
	}
	public void setBook_picture(String book_picture) {
		this.book_picture = book_picture;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public Set<Recommended> getRecommendeds() {
		return recommendeds;
	}
	public void setRecommendeds(Set<Recommended> recommendeds) {
		this.recommendeds = recommendeds;
	}
	
}
