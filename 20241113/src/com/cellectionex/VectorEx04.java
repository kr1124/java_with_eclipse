package com.cellectionex;

import java.util.*;

import buf.cio;

class MyData {
	String name;
	int age;

	public MyData() {
		name = "";
		age = 0;
	}
	public MyData(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class VectorEx04 {

	private static final String[] Colors = {"black", "yellow", "green", "blue", "red"};
	
	public static void main(String[] args) {
		
		Vector<MyData> v = new Vector<MyData>();
		v.add(new MyData("asdf", 9));
		v.add(new MyData("bnm", 29));
		v.add(new MyData("cvzx", 35));
		
		for(MyData my : v) {
			cio.wnlf("이름 : " + my.name + ", 나이 : " + my.age);
		}
		
	}

}
