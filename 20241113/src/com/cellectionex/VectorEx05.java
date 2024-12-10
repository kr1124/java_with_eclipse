package com.cellectionex;

import java.util.*;

import buf.cio;



public class VectorEx05 {

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
