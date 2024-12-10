package com.classex;

import java.io.*;

class Rectangle {
	static double Pi = 3.14;
	private int width;
	private int height;
	
	Rectangle() {
		this.width = 1;
		this.height = 1;
	}
	Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("가로 입력 : ");
		bw.flush();
		this.setWidth(Integer.parseInt(br.readLine()));
		bw.write("세로 입력 : ");
		bw.flush();
		this.setHeight(Integer.parseInt(br.readLine()));
		
		bw.close();
		br.close();
	}

	public void setWidth(int w) {
		this.width = w;
	}
	public void setHeight(int h) {
		this.height = h;
	}
	
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	
	public int area() {
		return width * height;
	}
	public int length() {
		return 2 * (width + height);
	}
	
	public void display() throws IOException {	
		BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw2.write("가로 : " + this.getWidth() + ", 세로 : " + this.getHeight());
		bw2.flush();
		bw2.close();
	}
}

public class ClassExam01 {

	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Rectangle rt = new Rectangle();
		rt.input();
		
		rt.display();

		br.close();
		bw.close();
	}
}
