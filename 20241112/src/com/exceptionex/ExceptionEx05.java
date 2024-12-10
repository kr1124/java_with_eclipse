package com.exceptionex;

import java.io.File;

import buf.cio;

public class ExceptionEx05 {

	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals("")) {
				throw new Exception("파일 이름이 유효하지 않습니다.");	
			}
		} catch (Exception e) {
			fileName = "제목없음.txt";
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
		System.out.println(f.getName() + " 생성 완료");
	}
}
