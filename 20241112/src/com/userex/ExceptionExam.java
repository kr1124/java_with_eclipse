package com.userex;

public class ExceptionExam {
	public static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			
			InstallException ie = new InstallException("설치 중 예외가 발생하였습니다.");
			ie.initCause(e);
			throw ie;
			
//			System.out.println("에러 메시지 : " + e.getMessage());
//			e.printStackTrace();
//			System.out.println("공간을 확보한 후 다시 설치하십시오.");
		} catch (MemoryException e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.gc(); //garbage collection
			System.out.println("다시 설치하십시오.");
		} finally {
			deleteTempFiles();
		}
	}
	
	public static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		if (!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
		
	}
	
	static void copyFiles() {
		
	}
	
	static void deleteTempFiles() {
		
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return false;
	}
	
	public static void main(String[] args) {
		try {
			install();			
		} catch (InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
