package com.bookstore.service.impl;

import java.util.List;

import com.bookstore.dao.EvaluationDao;
import com.bookstore.entity.Evaluation;
import com.bookstore.service.EvaluationService;


public class EvaluationServiceImpl implements EvaluationService {

	public EvaluationDao evaluationDao;
	public void setEvaluationDao(EvaluationDao evaluationDao) {
		this.evaluationDao = evaluationDao;
	}
	@Override
	public void addEvaluation(Evaluation evaluation) {
		// TODO 自动生成的方法存根
		evaluationDao.addEvaluation(evaluation);
	}

	@Override
	public void delEvaluation(Evaluation evaluation) {
		// TODO 自动生成的方法存根
		evaluationDao.delEvaluation(evaluation);
	}

	@Override
	public List<Evaluation> findEvaluationByBookId(int id) {
		// TODO 自动生成的方法存根
		List<Evaluation> evaluations=evaluationDao.findEvaluationByBookId(id);
		return evaluations;
	}
	@Override
	public Evaluation findEvaluationById(int id) {
		// TODO 自动生成的方法存根
		Evaluation evaluation=evaluationDao.findEvaluationById(id).get(0);
		return evaluation;
	}
	@Override
	public void updateEvaluation(int id, int agree) {
		// TODO 自动生成的方法存根
		Evaluation evaluation=evaluationDao.findEvaluationById(id).get(0);
		evaluation.setAgree(evaluation.getAgree()+agree);
		evaluationDao.updateEvaluation(evaluation);
	}
	@Override
	public void updateEvaluationHate(int id, int hate) {
		// TODO 自动生成的方法存根
		Evaluation evaluation=evaluationDao.findEvaluationById(id).get(0);
		evaluation.setHate(evaluation.getHate()+hate);
		evaluationDao.updateEvaluation(evaluation);
	}

}
