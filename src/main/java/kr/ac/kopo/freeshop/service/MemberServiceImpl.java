package kr.ac.kopo.freeshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.freeshop.dao.MemberDao;
import kr.ac.kopo.freeshop.model.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao dao;
	
	@Override
	public Member item(Member item) {
		return dao.item(item);
	}

	@Override
	public void add(Member member) {
		dao.add(member);
	}

	@Override
	public boolean checkId(String id) {
		if(dao.checkId(id)==0)
			return true;
		else
		return false;
	}
	@Override
	public boolean checkname(String name) {
		if(dao.checkname(name)==0)
			return true;
		else
		return false;
	}

}
