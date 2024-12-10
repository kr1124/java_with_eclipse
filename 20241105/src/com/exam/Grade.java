package com.exam;

import java.io.IOException;

import buf.cio;

public class Grade {
	int[] score = new int[3];
	int total;
	double avg;
	
	public Grade (int a, int b, int c) {
		score[0] = a;
		score[1] = b;
		score[2] = c;
		total = a + b + c;
		avg = cio.cr(total / 3.0, 3);
	}
	
	public double average() {
		return avg;
	}
	
	public static void main(String[] args) throws IOException {
		cio.w("�������� �Է� : ");
		cio.f();
		int kor = Integer.parseInt(cio.rl());
		cio.w("�������� �Է� : ");
		cio.f();
		int eng = Integer.parseInt(cio.rl());
		cio.w("�������� �Է� : ");
		cio.f();
		int mat = Integer.parseInt(cio.rl());
		
		Grade g = new Grade(kor, eng, mat);
		cio.w("����� :total / 3.0 " + g.average());
		cio.f();
		
		cio.brc();
		cio.bwc();
	}
}
