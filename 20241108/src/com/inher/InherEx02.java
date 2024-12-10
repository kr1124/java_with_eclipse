package com.inher;

import buf.cio;

class Point {
	private int x;
	private int y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		cio.wnl("(" + x + ", " + y + ")");
		cio.f();
	}
}

class ColorPoint extends Point {
	String color;

	public ColorPoint(int x, int y, String color) {
		set(x, y);
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//	@Override
	//	public void showPoint() throws IOException {
	//		// TODO Auto-generated method stub
	//		super.showPoint();
	//	}

	@Override
	public void showPoint() {
		super.showPoint();
	}
}

public class InherEx02 {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);

		p.showPoint();

	}

}
