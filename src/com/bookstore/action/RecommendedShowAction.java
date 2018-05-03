package com.bookstore.action;

import java.util.List;

import com.bookstore.entity.Book;
import com.bookstore.entity.Recommended;
import com.bookstore.service.RecommendedService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RecommendedShowAction extends ActionSupport {
	public RecommendedService recommendedService;
	public void setRecommendedService(RecommendedService recommendedService) {
		this.recommendedService = recommendedService;
	}
	@Override
	public String execute() throws Exception {
		List<Recommended> recommendeds=recommendedService.findRecommend();
		ActionContext.getContext().put("books", recommendeds);
		return SUCCESS;
	}
	
	
}
