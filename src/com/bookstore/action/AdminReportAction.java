package com.bookstore.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.bookstore.entity.Report;
import com.bookstore.service.ReportService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminReportAction extends ActionSupport {
	public ReportService reportService;
	public void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}
	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		List<Report> reports=reportService.findAllReport();
		ActionContext.getContext().put("reports", reports);
		return SUCCESS;
	}

	@Override
	public void validate() {
		// TODO 自动生成的方法存根
		if((int) ServletActionContext.getRequest().getSession().getAttribute("permission")!=2){
			addActionError("对不起，您不是管理员，不能访问该页面");
		}
	}
	
}
