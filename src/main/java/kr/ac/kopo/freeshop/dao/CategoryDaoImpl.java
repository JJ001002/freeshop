package kr.ac.kopo.freeshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.freeshop.model.Category;
@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Category> list() {
		
		return sql.selectList("category.list");
	}

}
