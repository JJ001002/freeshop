package kr.ac.kopo.freeshop.service;

import kr.ac.kopo.freeshop.model.Member;

public interface MemberService {

	Member item(Member item);

	void add(Member member);

	boolean checkId(String id);

	boolean checkname(String name);

}
