package com.polyex;

import java.util.Vector;

import buf.cio;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Vector item = new Vector();
	
	//Product[] item = new Product[10];
	int count = 0;
	
	public void buy(Product p) {
		if(money < p.price) {
			cio.wnlf("금액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		item.add(p);
		cio.wnlf("상품 " + p.getClass().getSimpleName() + "을(를) 구입했습니다.");
	}
	
	public void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			cio.wnlf(p + "을(를) 반품 했습니다.");
		}
		else {
			cio.wnlf("해당 상품은 존재하지 않습니다.");
		}
	}
	
	public void summary() {
		int sum = 0;
		
		String itemList = "";
		
		if(item.isEmpty()) {
			cio.wnlf("구매한 상품이 없습니다.");
			return;
		}
		
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += p + ", ";
		}
		
		cio.wnlf("구입한 제품의 총 금액은 " + sum + "입니다.");
		cio.wnlf("구입한 제품 리스트는 " + itemList + "입니다.");
	}
}
