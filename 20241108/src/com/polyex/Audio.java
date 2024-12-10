package com.polyex;

public class Audio extends Product {
	public Audio() {
		super(50);
	}
	public Audio(int price) {
		super(price);
	}
	
	@Override
	public String toString() {//최상위 객체 Object에 있는 메소드
		return "Audio";
	}
}
