package com.bookstore.action;

import org.apache.struts2.ServletActionContext;

import com.bookstore.service.EvaluationService;
import com.bookstore.service.ReportService;
import com.opensymphony.xwork2.ActionSupport;

public class AuditAction extends ActionSupport {
	public ReportService reportService;
	public EvaluationService evaluationService;
	public void setEvaluationService(EvaluationService evaluationService) {
		this.evaluationService = evaluationService;
	}
	public void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}
	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		int id=Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		int eva_id=Integer.parseInt(ServletActionContext.getRequest().getParameter("eva_id"));
		int state=Integer.parseInt(ServletActionContext.getRequest().getParameter("state"));
		if(state==1){
			reportService.state(eva_id);
			return SUCCESS;
		}
		if(state==0){
			reportService.delReport(id);
			evaluationService.delEvaluation(evaluationService.findEvaluationById(eva_id));
		}
		return SUCCESS;
	}
	
}
