package com.bookstore.service.impl;


import java.util.List;

import com.bookstore.dao.RecommendedDao;
import com.bookstore.entity.Book;
import com.bookstore.entity.Recommended;
import com.bookstore.service.RecommendedService;

public class RecommendedServiceImpl implements RecommendedService {
	
	public RecommendedDao recommendedDao;
	public void setRecommendedDao(RecommendedDao recommendedDao) {
		this.recommendedDao = recommendedDao;
	}
	@Override
	public void addRecommended(Recommended recommended) {
		// TODO 自动生成的方法存根
		recommendedDao.addRecommended(recommended);
	}
	@Override
	public List<Recommended> findRecommend() {
		List<Recommended> recommendeds=recommendedDao.findRecommended();
		List<Recommended> recommendeds2 = null;
		if(recommendeds.size()<=20){
			return recommendeds;
		}
		for(int index=recommendeds.size()-1;index>recommendeds.size()-21;index--){
			recommendeds2.add(recommendeds2.get(index));
		}
		return recommendeds2;
	}

	

}
