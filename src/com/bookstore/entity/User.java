
package com.bookstore.entity;

import java.util.HashSet;
import java.util.Set;

/*
 * CREATE TABLE user(
id int(10) AUTO_INCREMENT ,
username varchar(20) NOT NULL,
password varchar(32) NOT NULL,
realname varchar(20),
gender int(1) ,
nickname varchar(20),
email varchar(30),
telphone int(15),
sign varchar(50),
permission int(1),
picture varchar(50),
address varchar(50),
integral int(20),
PRIMARY KEY(id)
);

 */
public class User  {
	private int id;
	private String username;
	private String password;
	private String realname;
	private int gender;
	private String nickname;
	private String email;
	private int telphone;
	private String sign ;
	private int permission;
	private String picture;
	private String address;
	private int integral;
	//获取表单项
	private String repassword;
	private int validate_num;

	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public int getValidate_num() {
		return validate_num;
	}
	public void setValidate_num(int validate_num) {
		this.validate_num = validate_num;
	}
	//一对多映射
	private Set<Book> books =new HashSet<Book>();
	private Set<Order_items> order_items=new HashSet<Order_items>();
	private Set<Evaluation> evaluations=new HashSet<Evaluation>();
	private Set<Recommended> recommendeds=new HashSet<Recommended>();
	public User(){}
	//构造方法，初始化实体类。
	public User(String username,String password,String realname,int gender,
			String nickname,String email,int telphone,String sign,int permission,
			String picture,String address,int integral){
		this.username=username;
		this.password=password;
		this.realname=realname;
		this.gender=gender;
		this.nickname=nickname;
		this.email=email;
		this.telphone=telphone;
		this.sign=sign;
		this.permission=permission;
		this.picture=picture;
		this.address=address;
		this.integral=integral;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelphone() {
		return telphone;
	}
	public void setTelphone(int telphone) {
		this.telphone = telphone;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public int getPermission() {
		return permission;
	}
	public void setPermission(int permission) {
		this.permission = permission;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public Set<Order_items> getOrder_items() {
		return order_items;
	}
	public void setOrder_items(Set<Order_items> order_items) {
		this.order_items = order_items;
	}
	public Set<Evaluation> getEvaluations() {
		return evaluations;
	}
	public void setEvaluations(Set<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}
	public Set<Recommended> getRecommendeds() {
		return recommendeds;
	}
	public void setRecommendeds(Set<Recommended> recommendeds) {
		this.recommendeds = recommendeds;
	}
	
	
	
	
	
	
	
	
}