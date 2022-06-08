package kr.ac.kopo.freeshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.ac.kopo.freeshop.model.Category;

public interface CategoryService {

	List<Category> list();
	
}
