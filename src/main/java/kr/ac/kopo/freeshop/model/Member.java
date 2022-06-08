package kr.ac.kopo.freeshop.model;

public class Member {
	private String name;
	private String email;
	private String passwd;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	/*
	 * public boolean login() { if(email.equals("user") && passwd.equals("1234"))
	 * return true; else if(email.equals("admin") && passwd.equals("5678")) return
	 * true;
	 * 
	 * return false; }
	 */
	@Override
	public String toString() {
		return "Member [email=" + email + ", passwd=" + passwd + "]";
	}
}
