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
        bw.write("채널을 한개 올렸습니다.\n");
        bw.flush();
	}
	public void channelDown() {
		channel--;
	}
}
