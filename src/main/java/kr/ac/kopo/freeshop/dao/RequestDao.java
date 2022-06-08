package kr.ac.kopo.freeshop.dao;

import java.util.List;

import kr.ac.kopo.freeshop.model.Request;
import kr.ac.kopo.freeshop.util.Pager;

public interface RequestDao {

	List<Request> list(Pager pager);

	void add(Request item);

	Request item(int number);

	void update(Request item);

	void delete(int number);

	int total(Pager pager);

	

}
