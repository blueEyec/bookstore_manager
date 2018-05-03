package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Report;

public interface ReportService {
	/*
	 * 添加举报
	 */
	public void addReport(Report report);
	/*
	 * 根据id删除举报
	 */
	public void delReport(int id);
	/*
	 * 查询所有举报
	 */
	public List<Report> findAllReport();
	/*
	 * 查看举报的评论否已存在，
	 */
	public boolean isExist(int evaluation_id);
	/*
	 * 若存在查询出，并将计数器+1
	 */
	public void updateReport(int evaluation_id);
	/*
	 *审核通过，状态值置1
	 */
	public void state(int evaluation_id);
}
