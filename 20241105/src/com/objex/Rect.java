package com.objex;

public class Rect {
	int width, height;
	
	public void setData(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public int area() {
		return width * height;
	}
	
	public int length() {
		return 2 * (width + height);
	}
	
	public void write(int a) {
		System.out.println("result : " + a);
	}
}
