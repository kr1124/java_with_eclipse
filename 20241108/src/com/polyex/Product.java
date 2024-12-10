package com.polyex;

public class Product {
	int price;
	int bonusPoint;
	
	public Product() {
		price = 0;
		bonusPoint = 0;
	}
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = this.price / 10;
	}
}
