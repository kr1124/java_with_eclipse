package com.classexam;

import java.io.IOException;

import buf.cio;

class MyClass {
	
	private String name;
	private int age;
	
	public MyClass() {
		name = "¹«¸í";
		
	}
	public MyClass(String n) { //overloading
		name = n;
	}
	public MyClass(int a, String n) { //overloading
		age = a;
		name = n;
	}
	public MyClass(String n, int a) { //overloading
		age = a;
		name = n;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class MyClassEx {

	public static void main(String[] args) throws IOException {
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass("È«±âµ¿");
		MyClass mc3 = new MyClass(34, "È«±æµ¿");

		cio.bww(mc1.getName() + ", " + mc1.getAge());
		cio.bwnl();
		cio.bww(mc2.getName() + ", " + mc2.getAge());
		cio.bwnl();
		cio.bww(mc3.getName() + ", " + mc3.getAge());
		
		cio.bwf();
		
	}

}
