package kr.ac.kopo.freeshop.dao;

import java.util.List;

import kr.ac.kopo.freeshop.model.Reply;

public interface ReplyDao {

	void add(Reply item);

	Reply item(int reply_code);

	List<Reply> list(int number);

	void delete(int reply_code);

	void update(Reply item);

}
