package com.classexam;

class ThisEx {
	private String name;
	private String code;
	private String tel;
	
	public ThisEx() {
		this.name = "Guest";
		this.code = "000000-0000000";
		this.tel = "000-0000-0000";
	}
	
	public ThisEx(String name) {
		this();
		this.name = name;
	}
	
	public ThisEx(String name, String code) {
		this(name);
		this.code = code;
	}
	
	public ThisEx(String name, String code, String tel) {
		this(name, code);
		this.tel = tel;
	}
	
}

public class ThisEx01 {
	public static void main(String[] args) {
		ThisEx t= new ThisEx();


	}

}
