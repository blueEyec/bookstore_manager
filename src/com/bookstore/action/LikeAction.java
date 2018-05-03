package com.bookstore.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.type.IntegerType;

import com.bookstore.entity.Book;
import com.bookstore.entity.Evaluation;
import com.bookstore.entity.User;
import com.bookstore.service.BookService;
import com.bookstore.service.EvaluationService;
import com.bookstore.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LikeAction extends ActionSupport {
	public EvaluationService evaluationService;
	public UserService userService;
	public BookService bookService;
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public void setEvaluationService(EvaluationService evaluationService) {
		this.evaluationService = evaluationService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		int eva_id=Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		int book_id=Integer.parseInt(ServletActionContext.getRequest().getParameter("book_id"));
		evaluationService.updateEvaluation(eva_id, 1);
		Book book=bookService.findBookById(book_id);
		Evaluation evaluation=evaluationService.findEvaluationById(eva_id);
		if(evaluation.getUser()!=null){
			userService.addIntegral(evaluation.getUser().getId(), 1);//加分
		}
		
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
