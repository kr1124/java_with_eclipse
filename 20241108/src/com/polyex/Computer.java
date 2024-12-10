package com.polyex;

public class Computer extends Product {
	public Computer() {
		super(200);
	}
	public Computer(int price) {
		super(price);
	}
	
	@Override
	public String toString() {//최상위 객체 Object에 있는 메소드
		return "Computer";
	}
}
