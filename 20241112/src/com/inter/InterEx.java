package com.inter;

//서로 다른 부모를 상속하는 클래스들이 동일한 기능을 가질 때, 인터페이스로 해당 기능을 공통적으로 구현할 수 있음
//메서드는 전부 추상 메서드, 변수는 static임	

public interface InterEx {
	static final int A = 100;
	int getA();
}
