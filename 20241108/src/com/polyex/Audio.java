package com.polyex;

public class Audio extends Product {
	public Audio() {
		super(50);
	}
	public Audio(int price) {
		super(price);
	}
	
	@Override
	public String toString() {//�ֻ��� ��ü Object�� �ִ� �޼ҵ�
		return "Audio";
	}
}
