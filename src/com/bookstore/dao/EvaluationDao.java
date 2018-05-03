package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.Evaluation;

public interface EvaluationDao {
	//添加评论
	public void addEvaluation(Evaluation evaluation);
	//删除评论
	public void delEvaluation(Evaluation evaluation);
	/*
	 * 查询书籍id评论
	 */
	public List<Evaluation> findEvaluationByBookId(int id);
	/*
	 * 根据id查评论
	 */
	public List<Evaluation> findEvaluationById(int id);
	/*
	 * 更新评论
	 */
	public void updateEvaluation(Evaluation evaluation);
}
