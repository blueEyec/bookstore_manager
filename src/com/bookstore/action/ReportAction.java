package com.bookstore.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.bookstore.entity.Book;
import com.bookstore.entity.Evaluation;
import com.bookstore.entity.Report;
import com.bookstore.service.BookService;
import com.bookstore.service.EvaluationService;
import com.bookstore.service.ReportService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ReportAction extends ActionSupport {
	public ReportService reportService;
	public BookService bookService;
	public EvaluationService evaluationService;
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}
	public void setEvaluationService(EvaluationService evaluationService) {
		this.evaluationService = evaluationService;
	}
	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		
		int evaluation_id=Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		int book_id=Integer.parseInt(ServletActionContext.getRequest().getParameter("book_id"));
		Book book=bookService.findBookById(book_id);
		List<Evaluation> evaluations=evaluationService.findEvaluationByBookId(book.getId());
		ActionContext.getContext().put("book", book);
		ActionContext.getContext().put("evaluations", evaluations);
		System.out.println(reportService.isExist(evaluation_id));
		if(reportService.isExist(evaluation_id)==false){
			Report report=new Report();
			Evaluation evaluation=evaluationService.findEvaluationById(evaluation_id);
			report.setContent(evaluation.getContent());
			report.setEvaluation_id(evaluation_id);
			report.setCount(1);
			reportService.addReport(report);
			return SUCCESS;
		}
		reportService.updateReport(evaluation_id);
		return SUCCESS;
	}
	
}
