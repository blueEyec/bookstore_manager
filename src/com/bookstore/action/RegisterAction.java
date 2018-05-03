
package com.bookstore.action;




import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.bookstore.entity.User;
import com.bookstore.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;



public class RegisterAction extends ActionSupport implements ModelDriven<User> {
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
	

	public String execute()throws Exception{
//		//获取valueStack第一种
//		HttpServletRequest request=ServletActionContext.getRequest();
//		ValueStack vs1=(ValueStack) request.getAttribute("struts.valueStack");
//		//第二种
//		ActionContext context=ActionContext.getContext();
//		ValueStack vs2=context.getValueStack();
//		user.setPicture();
		
	
    	userService.register(user);
    	System.out.println(user.getUsername());

		return "success";
	
//		//获取actionContext对象
//		ActionContext context=ActionContext.getContext();
//		//存入数据
//		context.put("contextMap", "hello contextMap");
//		//获取key为session的map
//		Map<String, Object> sessionAttribute=context.getSession();
		//村map方式二
//    	HttpSession session=ServletActionContext.getRequest().getSession();
//    	session.setAttribute("sessionMap", "sessionmap1");
    }

	@Override
	public void validate() {
		// TODO 自动生成的方法存根
		if(ServletActionContext.getRequest().getSession().getAttribute("picture")==null){
			addFieldError("username", "请上传头像");
		}
		if(!Pattern.matches("[a-zA-Z][a-zA-Z0-9]{5,15}", user.getUsername())){
			addFieldError("username", "用户名请用5-15位英文字母或数字，且以字母开头");
			
		}
		if(!Pattern.matches("[a-zA-Z0-9]{8,20}", user.getPassword())){
			addFieldError("password", "密码只能由数字或字母组成，且最少8位，最多20位");
		}
		if(!user.getRepassword().equals(user.getPassword())){
			addFieldError("username", "两次密码输入不一致");
		}
		if(userService.isUserExist(user.getUsername())){
			addFieldError("username", "用户已存在");
		}
		
	}

	
        
 

    

}