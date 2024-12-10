package com.inter;

public class DemoImpl implements InterEx01 {

	@Override
	public void print() {
		System.out.println("인터페이스의 메소드 재정의...");
		return;
	}

	public void write() {
		System.out.println("클래스에 정의된 메소드..");
	}
}
