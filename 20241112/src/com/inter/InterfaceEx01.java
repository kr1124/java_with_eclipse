package com.inter;

public class InterfaceEx01 {

	public static void main(String[] args) {
		InterEx01 ie = new DemoImpl(); //업캐스팅
		
		ie.print();
		//ie.write();
		((DemoImpl)ie).write(); //다운캐스팅
		
		System.out.println(InterEx01.PI);
		//InterEx01.a = 30;
	}

}
