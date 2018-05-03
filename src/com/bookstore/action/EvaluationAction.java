package com.bookstore.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.bookstore.entity.Book;
import com.bookstore.entity.Evaluation;
import com.bookstore.entity.User;
import com.bookstore.service.BookService;
import com.bookstore.service.EvaluationService;
import com.bookstore.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EvaluationAction extends ActionSupport {
	public Evaluation evaluation=new Evaluation();
	public BookService bookService;
	public UserService userService;
	public EvaluationService evaluationService;
	public void setEvaluationService(EvaluationService evaluationService) {
		this.evaluationService = evaluationService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	private String content;
	private int id;
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	@Override
	public String execute() throws Exception {
		// TODO 自动生成的方法存根
		
		Date date=new Date();
		SimpleDateFormat sDateFormat=new SimpleDateFormat("yy-MM-dd-HH-mm-ss");
		String now=sDateFormat.format(date);
		Book book=bookService.findBookById(id);
		int user_id=(int)ServletActionContext.getRequest().getSession().getAttribute("id");
		userService.addIntegral(user_id, 3);//积分
		User user=userService.findUserById(user_id);
		evaluation.setContent(content);
		evaluation.setEva_time(now);
		evaluation.setBook(book);
		evaluation.setUser(user);
		evaluation.setUser_nickname(user.getNickname());
		evaluation.setAgree(0);
		evaluationService.addEvaluation(evaluation);
		ActionContext.getContext().put("book", book);
		List<Evaluation> evaluations =evaluationService.findEvaluationByBookId(book.getId());
		ActionContext.getContext().put("evaluations",evaluations);
		ServletActionContext.getRequest().getSession().setAttribute("integral", user.getIntegral());
		return SUCCESS;
	}
	@Override
	public void validate() {
		if(ServletActionContext.getRequest().getSession().getAttribute("id")==null){
			addActionError("您还未登陆");
		}
	}
	
	
}
