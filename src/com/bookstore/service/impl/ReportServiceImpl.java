package com.bookstore.service.impl;

import java.util.List;

import com.bookstore.dao.ReportDao;
import com.bookstore.entity.Report;
import com.bookstore.service.ReportService;

public class ReportServiceImpl implements ReportService {
	public ReportDao reportDao;
	public void setReportDao(ReportDao reportDao) {
		this.reportDao = reportDao;
	}
	@Override
	public void addReport(Report report) {
		// TODO 自动生成的方法存根
		reportDao.addReport(report);
	}

	@Override
	public void delReport(int id) {
		// TODO 自动生成的方法存根
		Report report=reportDao.findReportById(id);
		reportDao.delReport(report);
	}

	@Override
	public List<Report> findAllReport() {
		// TODO 自动生成的方法存根
		List<Report> reports=reportDao.findReport();
		return reports;
	}
	@Override
	public boolean isExist(int evaluation_id) {
		// TODO 自动生成的方法存根
		List<Report> reports=reportDao.findReportByEid(evaluation_id);
		if(reports.size()>0 && reports!=null){
			return true;
		}
		return false;
	}
	@Override
	public void updateReport(int evaluation_id) {
		// TODO 自动生成的方法存根
		Report report=reportDao.findReportByEid(evaluation_id).get(0);
		report.setCount(report.getCount()+1);
		reportDao.updateReport(report);
	}
	@Override
	public void state(int evaluation_id) {
		// TODO 自动生成的方法存根
		Report report=reportDao.findReportByEid(evaluation_id).get(0);
		report.setState(1);
		reportDao.updateReport(report);
	}

}
