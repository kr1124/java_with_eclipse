package com.polyex;

public class Computer extends Product {
	public Computer() {
		super(200);
	}
	public Computer(int price) {
		super(price);
	}
	
	@Override
	public String toString() {//�ֻ��� ��ü Object�� �ִ� �޼ҵ�
		return "Computer";
	}
}
