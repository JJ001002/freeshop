package kr.ac.kopo.freeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.freeshop.dao.CategoryDao;
import kr.ac.kopo.freeshop.model.Category;
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDao dao;

	
	@Override
	public List<Category> list() {
		return dao.list();
	}
	


	

}
