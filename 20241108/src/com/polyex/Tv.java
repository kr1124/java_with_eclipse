package com.polyex;

public class Tv extends Product {
	public Tv() {
		super(100);
	}
	public Tv(int price) {
		super(price);
	}
	
	@Override
	public String toString() {//최상위 객체 Object에 있는 메소드
		
		return "TV";
	}
}
