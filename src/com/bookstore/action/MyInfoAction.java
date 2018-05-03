package com.bookstore.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class MyInfoAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		return SUCCESS;
	}

	@Override
	public void validate() {
		// TODO 自动生成的方法存根
		if(ServletActionContext.getRequest().getSession().getAttribute("id")==null){
			addActionError("您还未登陆，请登陆");
		}
	}
	
}
