package com.inter;

public class InterfaceEx01 {

	public static void main(String[] args) {
		InterEx01 ie = new DemoImpl(); //��ĳ����
		
		ie.print();
		//ie.write();
		((DemoImpl)ie).write(); //�ٿ�ĳ����
		
		System.out.println(InterEx01.PI);
		//InterEx01.a = 30;
	}

}
