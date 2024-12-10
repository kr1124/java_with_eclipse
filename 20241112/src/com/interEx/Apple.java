package com.interEx;

public class Apple implements Fruit {
	@Override
	public int getPrice() {
		
		return 1000;
	}
	
	@Override
	public String getName() {
		return "Apple";
	}
}
