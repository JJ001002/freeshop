package kr.ac.kopo.freeshop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.freeshop.model.Reply;
import kr.ac.kopo.freeshop.model.Request;
import kr.ac.kopo.freeshop.service.ReplyService;


@RestController
@RequestMapping("/reply")
public class ReplyController {
	
	@Autowired
	ReplyService service;
	
	@PostMapping
	public Map<String, Object> add(@RequestBody Reply item){
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(item.getName());
		Reply reply = service.add(item);
		map.put("item", reply);
		map.put("msg", "ok");
		return map;
	}
	@GetMapping
	public List<Reply> list(int number) {
		System.out.println("실행");
		List<Reply> list= service.list(number);
		return list;
	}
	@DeleteMapping
	public int delete(int code) {
		service.delete(code);
		return code;
	}
	@PutMapping
	public Reply update(@RequestBody Reply item) {
		service.update(item);
		return item;
		
	}
	
}