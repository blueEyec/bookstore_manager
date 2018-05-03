
package com.bookstore.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import com.bookstore.entity.User;
import com.bookstore.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	private User user=new User();
	private UserService userService;
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
		
		User users=userService.login(user.getUsername(), user.getPassword(),user.getPermission());
		userService.addIntegral(users.getId(), 2);
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("id", users.getId());
		session.setAttribute("nickname", users.getNickname());
		session.setAttribute("picture", users.getPicture());
		session.setAttribute("integral", users.getIntegral());
		session.setAttribute("sign", users.getSign());
		session.setAttribute("username", users.getUsername());
		session.setAttribute("password", users.getPassword());
		session.setAttribute("email", users.getEmail());
		session.setAttribute("telphone", users.getTelphone());
		session.setAttribute("address", users.getAddress());
		session.setAttribute("realname", users.getRealname());
		session.setAttribute("permission", user.getPermission());
		return SUCCESS;
		
	}
	@Override
	public void  validate() {
		// TODO 自动生成的方法存根
		if(userService.login(user.getUsername(),user.getPassword(),user.getPermission())==null){
			addActionError("您输入的用户名或密码有误，请重新输入");
		}
		if(ServletActionContext.getRequest().getSession().getAttribute("id")!=null){
			addActionError("您已登陆请勿重复登陆");
			
		}
	}
	 
	
	
}