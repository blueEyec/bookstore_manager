package com.bookstore.service;

import java.util.List;
import com.bookstore.entity.Recommended;

public interface RecommendedService {
	/*
	 * 加入推荐
	 */
	public void addRecommended(Recommended recommended);
	/*
	 * 显示推荐
	 */
	public List<Recommended> findRecommend();
}
