package com.polyex;

import buf.cio;

public class ProductMain {
	public static void main(String[] args) {
		Buyer b= new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());

		
		
//		cio.wnlf("�ܾ��� " + b.money + "�Դϴ�.");
//		cio.wnlf("���� ����Ʈ ������ " + b.bonusPoint + "�Դϴ�.");
		
		b.summary();
	}
}
