package kr.ac.kopo.freeshop.dao;

import java.util.List;

import kr.ac.kopo.freeshop.model.Qna;
import kr.ac.kopo.freeshop.util.Pager;

public interface QnaDao {

	List<Qna> list(Pager pager);

	void add(Qna item);

	Qna item(int number);

	void update(Qna item);

	void delete(int number);

	int total(Pager pager);

}
