package com.bookstore.action;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginOutAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		ServletActionContext.getRequest().getSession().invalidate();
		return SUCCESS;
	}
	
	
}
