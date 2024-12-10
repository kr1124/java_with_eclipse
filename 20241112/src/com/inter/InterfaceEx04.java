package com.inter;

interface Demo {
	public void write();
	public void print();
}

abstract class DemoImpl2 implements Demo {
	@Override
	public void write() {
		System.out.println("write method");		
	}
}

class DemoImplSub extends DemoImpl2 {
	@Override
	public void print() {
		
	}
}

public class InterfaceEx04 {

	public static void main(String[] args) {
		DemoImplSub ds = new DemoImplSub();
		ds.write();
		ds.print();

	}

}
