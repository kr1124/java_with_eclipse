package com.overex;

import java.io.*;

public class OverloadingEx03 {

	public void print() {
		System.out.println("인자 없는 메소드");
	}
	public void print(short val) {
		System.out.println("short 메소드");
	}
	public void print(int val) {
		System.out.println("int 메소드");
	}
	public void write(short val) {
		System.out.println("short");
	}
	public void write(int val) {
		System.out.println("int");
	}
	public void write(long val) {
		System.out.println("long");
	}
	
	public void sub(long val) {
		System.out.println("long");
	}

	
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		OverloadingEx03 oe3 = new OverloadingEx03();
		short s = 10;
		short ss = 20;
		int i = 10;
		long l = 10;

		oe3.print();
		oe3.print(s);
		oe3.print(i);
		//oe3.print(l);
		
		br.close();
		bw.close();
	}

}
