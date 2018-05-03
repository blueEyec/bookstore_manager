package com.bookstore.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bookstore.dao.ReportDao;
import com.bookstore.entity.Report;

public class ReportDaoImpl extends HibernateDaoSupport implements ReportDao {

	@Override
	public void addReport(Report report) {
		// TODO 自动生成的方法存根
		this.getHibernateTemplate().save(report);
	}

	@Override
	public void updateReport(Report report) {
		// TODO 自动生成的方法存根
		this.getHibernateTemplate().update(report);
	}

	@Override
	public void delReport(Report report) {
		// TODO 自动生成的方法存根
		this.getHibernateTemplate().delete(report);
	}

	@Override
	public List<Report> findReport() {
		// TODO 自动生成的方法存根
		String hql="from Report r";
		List<Report> reports=(List<Report>) this.getHibernateTemplate().find(hql);
		return reports;
	}

	@Override
	public List<Report> findReportByEid(int evaluation_id) {
		// TODO 自动生成的方法存根
		String hql="from Report r WHERE r.evaluation_id=?";
		List<Report> reports= (List<Report>) this.getHibernateTemplate().find(hql, evaluation_id);
		return reports;
	}

	@Override
	public Report findReportById(int id) {
		// TODO 自动生成的方法存根
		String hql="from Report r WHERE r.id=?";
		Report report=(Report) this.getHibernateTemplate().find(hql, id).get(0);
		return report;
	}

}
