package com.oper;

import java.io.*;

public class OperExam01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int dig = System.in.read() - '0';
		
		//String gender = dig == 1 ? "����" : dig == 2 ? "����" : "�߸��� ���� �Է�";
		//System.out.println(gender);

		System.out.println(dig == 1 ? "����" : (dig == 2 ? "����" : "�߸��� �Է�"));
	}

}
