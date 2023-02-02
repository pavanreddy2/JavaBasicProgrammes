package com.constructorExample;

class Student {
	private int sid;
	private String sname;
	private String sadd;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

}

public class SudentEXampleforThisKeyword {
	public static void main(String[] args) {

		Student s = new Student();

		s.setSid(1000);
		
		System.out.println(s.getSid());
	}
}
