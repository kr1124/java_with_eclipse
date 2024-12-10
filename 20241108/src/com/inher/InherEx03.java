package com.inher;

import buf.cio;

class MyPoint {
	private int x;
	private int y;

	protected MyPoint() {
		cio.wf("x : ");
		this.x = Integer.parseInt(cio.rl());
		cio.wf("y : ");
		this.y = Integer.parseInt(cio.rl());
	}
	
	protected void display() {
		cio.nl();
		cio.wnl("점(x, y) : (" + this.x + ", " + this.y + ")");
	}
	
	protected void dlkf(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle extends MyPoint {
	private int r;
	
	public Circle() {
		super();
		cio.wf("r : ");
		this.r = cio.rli();
	}

	@Override
	protected void display() {
		super.display();
		cio.wnlf("반지름 r : " + this.r);
	}
}

class Rect extends MyPoint {
	private int w;
	private int h;
	
	public Rect() {
		super();
		cio.wf("w ; ");
		this.w = cio.rli();
		cio.wf("h ; ");
		this.h = cio.rli();
	}
	
	@Override
	protected void display() {
		super.display();
		cio.wnlf("폭 : " + this.w + "높이 : " + this.h);
	}
}

public class InherEx03 {
	public static void main(String[] args) {
//		Circle cc = new Circle();
//		cc.display();
		
		MyPoint mp = new MyPoint();
		
		new Circle().display();

		cio.nlf();
		
		Rect rr = new Rect();
		rr.display();
		
		cio.cc();
	}

}
