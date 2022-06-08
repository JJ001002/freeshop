package kr.ac.kopo.freeshop.service;

import java.util.List;

import kr.ac.kopo.freeshop.model.Qna;

import kr.ac.kopo.freeshop.util.Pager;

public interface QnaService {

	List<Qna> list(Pager pager);

	void add(Qna item);

	Qna item(int number);

	void update(Qna item);

	void delete(int number);

	void dummy();

	void init();

	

}