package com.polyex;

public class Tv extends Product {
	public Tv() {
		super(100);
	}
	public Tv(int price) {
		super(price);
	}
	
	@Override
	public String toString() {//�ֻ��� ��ü Object�� �ִ� �޼ҵ�
		
		return "TV";
	}
}
