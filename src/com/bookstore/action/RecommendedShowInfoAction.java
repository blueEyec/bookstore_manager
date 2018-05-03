package com.bookstore.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.bookstore.entity.Book;
import com.bookstore.entity.Evaluation;
import com.bookstore.entity.Recommended;
import com.bookstore.service.BookService;
import com.bookstore.service.EvaluationService;
import com.bookstore.service.RecommendedService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RecommendedShowInfoAction extends ActionSupport {
	public BookService bookService;
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public EvaluationService evaluationService;
	public void setEvaluationService(EvaluationService evaluationService) {
		this.evaluationService = evaluationService;
	}
	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		int id=Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		Book book=bookService.findBookById(id);
		ActionContext.getContext().put("sell_id", book.getUser().getId());
		List<Evaluation> evaluations=evaluationService.findEvaluationByBookId(id);
		ActionContext.getContext().put("book", book);
		ActionContext.getContext().put("evaluations", evaluations);
		return SUCCESS;
	}
	
}
