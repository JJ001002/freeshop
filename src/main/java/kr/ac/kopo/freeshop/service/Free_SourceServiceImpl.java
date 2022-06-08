package kr.ac.kopo.freeshop.service;

import java.io.ObjectInputStream.GetField;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.freeshop.dao.FileDao;
import kr.ac.kopo.freeshop.dao.Free_SourceDao;
import kr.ac.kopo.freeshop.dao.ThumbnailDao;
import kr.ac.kopo.freeshop.model.Free_Source;
import kr.ac.kopo.freeshop.model.Posts;
import kr.ac.kopo.freeshop.model.Request;
import kr.ac.kopo.freeshop.util.Pager;

@Service
public class Free_SourceServiceImpl implements Free_SourceService {
	
	@Autowired
	Free_SourceDao dao;

	@Autowired
	FileDao dao1;
	
	@Autowired
	ThumbnailDao dao2;
	
	@Override
	public List<Free_Source> list(Pager pager) {
		int total = dao.total(pager);
		
		pager.setTotal(total);
		
		return dao.list(pager);
	}


	@Override
	public void add(Posts item) {
		dao.add(item);
		
		item.getFile().setNumber(item.getNumber());
		dao1.add(item.getFile());
		item.getThumbnail1().setNumber(item.getNumber());
		dao2.add(item.getThumbnail1());
	}
	
	
}
