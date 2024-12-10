package com.objex;

public class RectEx {

	public static void main(String[] args) {
		Rect r1 = new Rect();
		Rect r2 = new Rect();
		Rect r3 = new Rect();
		r1.setData(10, 20);
		r2.setData(30, 20);
		
		
		int rarea = r1.area();
		int rlenght = r1.length();

		System.out.println("r1 area : " + r1.area() + ", r1 length : " + r1.length());
		System.out.println("r2 area : " + r2.area() + ", r2 length : " + r2.length());
		
		r3.width = 10;
		r3.height = 20;
		
		int c = r3.area();
		int d = r3.length();
		r3.write(c);
		r3.write(d);
	}

}
