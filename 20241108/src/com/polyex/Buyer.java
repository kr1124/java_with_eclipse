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
			cio.wnlf("�ݾ��� �����մϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		item.add(p);
		cio.wnlf("��ǰ " + p.getClass().getSimpleName() + "��(��) �����߽��ϴ�.");
	}
	
	public void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			cio.wnlf(p + "��(��) ��ǰ �߽��ϴ�.");
		}
		else {
			cio.wnlf("�ش� ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}
	
	public void summary() {
		int sum = 0;
		
		String itemList = "";
		
		if(item.isEmpty()) {
			cio.wnlf("������ ��ǰ�� �����ϴ�.");
			return;
		}
		
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += p + ", ";
		}
		
		cio.wnlf("������ ��ǰ�� �� �ݾ��� " + sum + "�Դϴ�.");
		cio.wnlf("������ ��ǰ ����Ʈ�� " + itemList + "�Դϴ�.");
	}
}
