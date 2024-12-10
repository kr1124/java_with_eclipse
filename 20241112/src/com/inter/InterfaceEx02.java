package com.inter;

public class InterfaceEx02 implements InterEx {

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx02 ifex = new InterfaceEx02();
		System.out.println("getA() : " + ifex.getA());
	}

}
