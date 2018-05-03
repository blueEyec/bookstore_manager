package com.bookstore.dao;

import com.bookstore.entity.Recommended;
import java.util.List;

public interface RecommendedDao {
	/*
	 * 加入推荐
	 */
	public void addRecommended(Recommended recommended);
	/*
	 * 查询推荐20条
	 */
	public List<Recommended> findRecommended();
}
