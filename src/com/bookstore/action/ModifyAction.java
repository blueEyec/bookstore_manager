package com.bookstore.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.Password;

import com.bookstore.entity.User;
import com.bookstore.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModifyAction extends ActionSupport implements ModelDriven<User>{
	
	private User user=new User();
	public UserService userService;
	public void setUserService(UserService userService){
		this.userService=userService;
	}
	@Override
	public User getModel() {
		// TODO 自动生成的方法存根
		return user;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		HttpSession session=ServletActionContext.getRequest().getSession();
		int id=(int) session.getAttribute("id");
		
		User user1=userService.findUserById(id);
		user1.setPassword(user.getPassword());
		user1.setNickname(user.getNickname());
		user1.setEmail(user.getEmail());
		user1.setTelphone(user.getTelphone());
		user1.setAddress(user.getAddress());
		user1.setSign(user.getSign());
		user1.setPicture(user.getPicture());
		userService.update(user1);
		session.setAttribute("password", user.getPassword());
		session.setAttribute("nickname", user.getNickname());
		session.setAttribute("email", user.getEmail());
		session.setAttribute("telphone", user.getTelphone());
		session.setAttribute("address", user.getAddress());
		session.setAttribute("sign", user.getSign());
		session.setAttribute("picture", user.getPicture());
		return SUCCESS;
		
	}
	@Override
	public void validate() {
		// TODO 自动生成的方法存根
		if(user.getPassword()!=user.getRepassword()){
			addActionError("您两次输入的密码不一致");
		}
	}
}
