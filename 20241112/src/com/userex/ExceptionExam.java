package com.userex;

public class ExceptionExam {
	public static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			
			InstallException ie = new InstallException("��ġ �� ���ܰ� �߻��Ͽ����ϴ�.");
			ie.initCause(e);
			throw ie;
			
//			System.out.println("���� �޽��� : " + e.getMessage());
//			e.printStackTrace();
//			System.out.println("������ Ȯ���� �� �ٽ� ��ġ�Ͻʽÿ�.");
		} catch (MemoryException e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
			System.gc(); //garbage collection
			System.out.println("�ٽ� ��ġ�Ͻʽÿ�.");
		} finally {
			deleteTempFiles();
		}
	}
	
	public static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}
		if (!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����մϴ�.");
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
