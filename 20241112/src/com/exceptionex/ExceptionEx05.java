package com.exceptionex;

import java.io.File;

import buf.cio;

public class ExceptionEx05 {

	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals("")) {
				throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");	
			}
		} catch (Exception e) {
			fileName = "�������.txt";
		} finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		File f = createFile("dflk");
		System.out.println(f.getName() + " ���� �Ϸ�");
	}
}
