package com.bookstore.entity;
/*
 * CREATE TABLE evaluation(
id int(10),
user_id int(10),
eva_time DATETIME,
content varchar(50),
agree int(10),
FOREIGN KEY(user_id) REFERENCES user(id),
PRIMARY KEY(id)
);
 */


public class Evaluation {
	private int id;
	
	private String eva_time;
	private String content;
	private int agree;
	private int hate;
	private String user_nickname;
	
	private User user;
	private Book book;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getEva_time() {
		return eva_time;
	}
	public void setEva_time(String eva_time) {
		this.eva_time = eva_time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getAgree() {
		return agree;
	}
	public void setAgree(int agree) {
		this.agree = agree;
	}
	public void setHate(int hate) {
		this.hate = hate;
	}
	public int getHate() {
		return hate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	
}
