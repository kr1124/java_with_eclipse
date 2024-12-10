package com.overex;

import java.io.*;

public class OverloadingEx04 {

	public int area(int w, int h) {
		return w * h;
	}	
	public double area(int r) {
		return r * r * 3.14159265;
	}

	public void write(int result) {
		System.out.println("사각형 : " + result);
	}
	public void write(double result) {
		System.out.println("원 : " + result);
	}
	

	
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		OverloadingEx04 oe4 = new OverloadingEx04();
		int re = oe4.area(10, 5);
		double ci = oe4.area(3);
		oe4.write(re);
		oe4.write(ci);
		
		br.close();
		bw.close();
	}

}
