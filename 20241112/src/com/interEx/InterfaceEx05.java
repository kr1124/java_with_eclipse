package com.interEx;

import buf.cio;

public class InterfaceEx05 {

	public static void packing(Fruit fruit) {
		cio.wnlf(fruit.getName() + " : " + fruit.getPrice());
	}
	
	public static void main(String[] args) {
		Apple apple = new Apple();
		Orange orange = new Orange();
		
		cio.wf("과일명 입력 : ");
		String a = cio.rl();
		if(a.equals("Apple")) {
			packing(apple);			
		}
		else if(a.equals("Orange")) {
			packing(orange);			
		}
		
	}
}
