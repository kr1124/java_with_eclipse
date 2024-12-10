package com.inher;

import java.io.IOException;

import buf.cio;

class CellPhone {
	public String model;
	String number;
	int chord;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public int getChord() {
		return chord;
	}
}

class MP3Phone extends CellPhone {
	int size;

	public MP3Phone(String model, String num, int chord, int size) {
		this.model = model;
		this.number = num;
		this.chord = chord;
		this.size = size;
	}
}

public class InherEx01 {

	public static void main(String[] args) throws IOException{
		MP3Phone mp = new MP3Phone("Samsung", "010-1111-1111", 23, 250);
		
		mp.model = "LG";
		
		mp.setNumber("020-4059-4839");
		mp.number = "010-3949-8209";

		System.out.println(mp.number);
		System.out.println(mp.getNumber());
		
		cio.w(mp.model + "\n");
		cio.w(mp.number + "\n");
		cio.wnl(mp.chord);
		cio.wnl(mp.size);
		cio.f();
	}

}
