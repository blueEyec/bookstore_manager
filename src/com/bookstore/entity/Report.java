package com.bookstore.entity;
/*
 * CREATE TABLE report(
id int(10) AUTO_INCREMENT,
evaluation_id int(10),
content varchar(200),
count int(10),
primary key(id)
)

 */
public class Report {
	private int id;
	private String content;
	private int count;
	private int evaluation_id;
	private int state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setEvaluation_id(int evaluation_id) {
		this.evaluation_id = evaluation_id;
	}
	public int getEvaluation_id() {
		return evaluation_id;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getState() {
		return state;
	}
	
}
