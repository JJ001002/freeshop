package kr.ac.kopo.freeshop.model;

public class Posts {
	
	private int number;
	private String name;
	private String category;
	private String title;
	private String writing;
	private String regtime;
	
	private UploadFile thumbnail1;
	private UploadFile file;
	
	

	public UploadFile getThumbnail1() {
		return thumbnail1;
	}

	public void setThumbnail1(UploadFile thumbnail1) {
		this.thumbnail1 = thumbnail1;
	}

	public UploadFile getFile() {
		return file;
	}

	public void setFile(UploadFile file) {
		this.file = file;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriting() {
		return writing;
	}

	public void setWriting(String writing) {
		this.writing = writing;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
