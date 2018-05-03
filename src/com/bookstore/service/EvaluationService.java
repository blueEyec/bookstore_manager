package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Evaluation;

public interface EvaluationService {
	/*
	 * 添加评论
	 */
	public void addEvaluation(Evaluation evaluation);
	/*
	 * 删除评论
	 */
	public void delEvaluation(Evaluation evaluation);
	/*
	 * 查询评论通过书籍id
	 */
	public List<Evaluation> findEvaluationByBookId(int id);
	/*
	 * 查询评论根据评论id
	 */
	public Evaluation findEvaluationById(int id);
	/*
	 * 更新评论点赞数
	 */
	public void updateEvaluation(int id,int agree);
	/*
	 * 更新厌恶数
	 */
	public void updateEvaluationHate(int id,int hate);
}
