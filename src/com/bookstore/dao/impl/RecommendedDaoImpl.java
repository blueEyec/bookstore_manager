package com.bookstore.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bookstore.dao.RecommendedDao;
import com.bookstore.entity.Book;
import com.bookstore.entity.Recommended;

public class RecommendedDaoImpl extends HibernateDaoSupport implements RecommendedDao{

	@Override
	public void addRecommended(Recommended recommended) {
		// TODO 自动生成的方法存根
		this.getHibernateTemplate().save(recommended);
	}

	@Override
	public List<Recommended> findRecommended() {
		String hql="from Recommended r";
		List<Recommended> recommendeds=(List<Recommended>) this.getHibernateTemplate().find(hql);
		return recommendeds;
	}

}
