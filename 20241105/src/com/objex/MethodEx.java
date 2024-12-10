package com.objex;

public class MethodEx {
	public int add(int a, int b) {//인스턴스 메서드
    	return a + b;
    }
    public int sub(int a, int b) {
    	return a - b;
    }
    public int mul(int a, int b) {
    	return a * b;
    }
    public int div(int a, int b) {
    	if(b == 0) {
    		return 0;
    	}
    	else {
    		return a / b;
    	}
    }
    public int mod(int a, int b) {
    	return a % b;
    }
    
    public static int add2(int a, int b) {
    	
    	return a + b;
    }
}
