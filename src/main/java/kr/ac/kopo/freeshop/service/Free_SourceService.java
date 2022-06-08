package kr.ac.kopo.freeshop.service;

import java.util.List;

import kr.ac.kopo.freeshop.model.Free_Source;
import kr.ac.kopo.freeshop.model.Posts;
import kr.ac.kopo.freeshop.util.Pager;

public interface Free_SourceService {

	List<Free_Source> list(Pager pager);

	void add(Posts item);

}
