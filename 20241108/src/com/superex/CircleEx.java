package com.superex;

public class CircleEx extends PointEx {
	private int r;
	
	public CircleEx() {}
	public CircleEx(int x) {
		super(x);
		r = 1;
	}
	public CircleEx(int x, int y) {
		super(x, y);
		r = 2;
	}
	public CircleEx(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("r°ª : " + r);
	}
	
	public static void main(String[] args) {
		CircleEx ce = new CircleEx();
		ce.display();
	}
}
