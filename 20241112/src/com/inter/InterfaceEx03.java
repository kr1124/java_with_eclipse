package com.inter;

interface Inter1 {
	public int getA();
	
}

interface Inter2 {
	public int getA();
}

interface Inter3 extends Inter1, Inter2 {
	public int getData();
}

public class InterfaceEx03 implements Inter3 {

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx03 it = new InterfaceEx03();

		Inter1 it1 = it;
		Inter2 it2 = it;
		Inter3 it3 = it;
		
		

		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
	}

}
