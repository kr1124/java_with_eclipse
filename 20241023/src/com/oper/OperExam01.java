package com.oper;

import java.io.*;

public class OperExam01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int dig = System.in.read() - '0';
		
		//String gender = dig == 1 ? "남성" : dig == 2 ? "여성" : "잘못된 숫자 입력";
		//System.out.println(gender);

		System.out.println(dig == 1 ? "남성" : (dig == 2 ? "여성" : "잘못된 입력"));
	}

}
