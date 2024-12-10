package com.sungjuk;

import java.io.*;

public class Sungjuk {
	int count;
	Record[] re;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public void setCount() throws IOException {
		do {
			bw.write("�ο��� �Է�(1 ~ 100) : ");
			bw.flush();
			this.count = Integer.parseInt(br.readLine());
		} while(count < 1 || count > 100);
		
		re = new Record[count];
	}
	
	public void input() throws IOException {
		if(count == 0) {
			bw.write("sadfj");
			bw.flush();
			this.setCount();
		}
		
		for(int i = 0; i < re.length; i++) {
			re[i] = new Record();
			
			bw.write((i + 1) + "�� �̸� �Է� : ");
			bw.flush();
			re[i].setName(br.readLine());

			bw.write("���� ���� �Է� : ");
			bw.flush();
			re[i].setKor(Integer.parseInt(br.readLine()));
			bw.write("���� ���� �Է� : ");
			bw.flush();
			re[i].setEng(Integer.parseInt(br.readLine()));
			bw.write("���� ���� �Է� : ");
			bw.flush();
			re[i].setMat(Integer.parseInt(br.readLine()));
			
			re[i].updateTotal();
			re[i].updateAvg();
		}
	}
	
	public void updateRank() {
		if(count == 0) {
			return;
		}
		for(int i = 0; i < re.length; i++) {
			re[i].setRank(i + 1);
		}
		
		for(int i = 0; i < re.length - 1; i++) {
			for(int j = i; j < re.length - i; j++) {
				
			}
		}
		
	}
	
	public void display() throws IOException {
		if(count == 0) {
			return;
		}
		
		bw.write("�̸�\t����\t����\t����\t����\t���\t���");
		for(int i = 0; i < re.length; i++) {
			bw.write(re[i].getName() + "\t");
			bw.write(re[i].getKor() + "\t" + re[i].getEng() + "\t" + re[i].getMat() + "\t");
			bw.write(re[i].getTotal() + "\t" + re[i].getAvg() + "\t" + re[i].getRank());
			bw.newLine();
		}
		bw.flush();
	}
}
