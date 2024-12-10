package com.classex;

import java.io.*;

class CustomRound {
	static double cr(double input) {
		double tp = Math.pow(10, 2);
		return (int)(input * tp + 0.5) / tp;
	}
	static double cr(double input, int place) {
		double tp = Math.pow(10, place);
		return (int)(input * tp + 0.5) / tp;
	}
}

class CircleEx {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static final double Pi = 3.14159265;
	private double radius;
	
	CircleEx() {
		this.radius = 1;
	}
	CircleEx(double r) {
		this.radius = r;
	}
	
	public void input() throws IOException {
		bw.write("반지름 길이 입력 : ");
		bw.flush();
		this.setWidth(Double.parseDouble(br.readLine()));
	}

	public void setWidth(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return this.radius;
	}
	
	public double getDiameter() {
		return this.radius * 2;
	}
	
	public double area() {
		return this.radius * this.radius * CircleEx.Pi;
	}
	public double length() {
		return 2 * this.radius * CircleEx.Pi;
	}
	
	public void display() throws IOException {
		bw.write("반지름 : " + this.getRadius() + ", 넓이 : " + CustomRound.cr(this.area(), 2) + ", 둘레 : " + CustomRound.cr(this.length(), 2));
		bw.flush();
	}
}

public class ClassExam02 {

	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		CircleEx ci = new CircleEx();
		ci.input();
		
		ci.display();

		br.close();
		bw.close();
	}
}
