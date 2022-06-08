package kr.ac.kopo.freeshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.freeshop.model.Category;
import kr.ac.kopo.freeshop.model.Request;
import kr.ac.kopo.freeshop.service.CategoryService;


@Controller
@RequestMapping("/posts")
public class PostsController {
	final String path = "posts/";
	
	@Autowired
	CategoryService service;
	
	@GetMapping("/list")
	public String list() {
		return path + "list";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		
		List<Category> list = service.list();
		
		model.addAttribute("list", list);
		
		for(Category item : list) {
			System.out.println(item.getContents());
		}
		
		return path + "add";
	}
	
	
}


