package com.classex;

import java.io.*;

public class Tv {
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public String color;
	public boolean power;
	public int channel;
	
	public void power() {
		power = !power;
	}
	public void channelUp() throws IOException {
		channel++;
        bw.write("ä���� �Ѱ� �÷Ƚ��ϴ�.\n");
        bw.flush();
	}
	public void channelDown() {
		channel--;
	}
}
