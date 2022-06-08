package kr.ac.kopo.freeshop.dao;

import kr.ac.kopo.freeshop.model.Member;

public interface MemberDao {

	Member item(Member item);

	void add(Member member);

	int checkId(String id);

	int checkname(String name);
	

}
