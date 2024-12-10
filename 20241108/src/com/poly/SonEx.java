package com.poly;

public class SonEx extends ParentEx {
	int foo = 7;
	String name = "SonEx";
	
	public SonEx() {
		name = getClass().getSimpleName();
	}
	
	public static void main(String[] args) {
		ParentEx pe = new SonEx();
		System.out.println(pe.toString());

		System.out.println(pe.getNumber(0));
		System.out.println(pe.foo);
	}
}
