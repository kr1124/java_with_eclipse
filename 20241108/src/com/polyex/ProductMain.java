package com.polyex;

import buf.cio;

public class ProductMain {
	public static void main(String[] args) {
		Buyer b= new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());

		
		
//		cio.wnlf("잔액은 " + b.money + "입니다.");
//		cio.wnlf("현재 포인트 점수는 " + b.bonusPoint + "입니다.");
		
		b.summary();
	}
}
