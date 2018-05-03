package com.bookstore.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.bookstore.entity.Book;
import com.bookstore.entity.Evaluation;
import com.bookstore.service.BookService;
import com.bookstore.service.EvaluationService;
import com.bookstore.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HateAction extends ActionSupport {
	public EvaluationService evaluationService;
	public BookService bookService;
	public UserService userService;
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public void setEvaluationService(EvaluationService evaluationService) {
		this.evaluationService = evaluationService;
	}
	@Override
	public String execute() throws Exception {
		int eva_id=Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		int book_id=Integer.parseInt(ServletActionContext.getRequest().getParameter("book_id"));
		evaluationService.updateEvaluationHate(eva_id, 1);
		Book book=bookService.findBookById(book_id);
		Evaluation evaluation=evaluationService.findEvaluationById(eva_id);
//		if(evaluation.getUser()!=null){
//			userService.delIntegral(evaluation.getUser().getId(), 1);//扣分
//		}
		List<Evaluation> evaluations=evaluationService.findEvaluationByBookId(book.getId());
		ActionContext.getContext().put("book", book);
		ActionContext.getContext().put("evaluations", evaluations);
		return SUCCESS;
	}

	@Override
	public void validate() {
		// TODO 自动生成的方法存根
		if(ServletActionContext.getRequest().getSession().getAttribute("id")==null){
			addActionError("您还未登陆");
		}
	}
	
}
