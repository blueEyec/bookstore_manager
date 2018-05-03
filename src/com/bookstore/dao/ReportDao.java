package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.Report;

public interface ReportDao {
	/*
	 * 添加举报
	 */
	public void addReport(Report report);
	/*
	 * 更新举报次数
	 */
	public void updateReport(Report report);
	/*
	 * 删除举报内容后，删除这条信息
	 */
	public void delReport(Report report);
	/*
	 * 查询所有的举报信息
	 */
	public List<Report> findReport();
	/*
	 * 根据评论id查询举报
	 */
	public List<Report> findReportByEid(int evaluation_id);
	/*
	 * 根据举报表id查询
	 */
	public Report findReportById(int id);
}
