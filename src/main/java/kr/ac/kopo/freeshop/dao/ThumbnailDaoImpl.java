package kr.ac.kopo.freeshop.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.freeshop.model.Posts;
import kr.ac.kopo.freeshop.model.UploadFile;

@Repository
public class ThumbnailDaoImpl implements ThumbnailDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public void add(UploadFile item) {
		sql.insert("thumbnail.add", item);

	}

	

}
