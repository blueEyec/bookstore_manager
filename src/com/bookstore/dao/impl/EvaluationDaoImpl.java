package com.bookstore.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bookstore.dao.EvaluationDao;
import com.bookstore.entity.Evaluation;

public class EvaluationDaoImpl extends HibernateDaoSupport implements EvaluationDao {

	@Override
	public void addEvaluation(Evaluation evaluation) {
		// TODO 自动生成的方法存根
		this.getHibernateTemplate().save(evaluation);
	}

	@Override
	public void delEvaluation(Evaluation evaluation) {
		// TODO 自动生成的方法存根
		this.getHibernateTemplate().delete(evaluation);
	}

	@Override
	public List<Evaluation> findEvaluationByBookId(int id) {
		// TODO 自动生成的方法存根
		String hql="from Evaluation e WHERE e.book.id=?";
		List<Evaluation> evaluations=(List<Evaluation>) this.getHibernateTemplate().find(hql, id);
		return evaluations;
	}

	@Override
	public List<Evaluation> findEvaluationById(int id) {
		// TODO 自动生成的方法存根
		String hql="from Evaluation e WHERE e.id=?";
		List<Evaluation> evaluations=(List<Evaluation>) this.getHibernateTemplate().find(hql, id);
		return evaluations;
	}

	@Override
	public void updateEvaluation(Evaluation evaluation) {
		// TODO 自动生成的方法存根
		this.getHibernateTemplate().update(evaluation);
	}

}
