package com.exam;

import java.io.IOException;

import buf.cio;

public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {
		this.title = "tttttt";
		this.artist = "arijsdijot";
		this.year = 1999;
		this.country = "korea";
	}

	public Song(int year) {
		this();
		this.year = year;
//		this.title = "tttttt";
//		this.artist = "arijsdijot";
//		this.country = "korea";
	}
	public Song(int year, String country) {
		this(year);
		this.country = country;
//		this.title = "tttttt";
//		this.artist = "arijsdijot";
//		this.year = year;
	}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
		
	}


	public void show() throws IOException {
		
		
		cio.w(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
		cio.f();
	}


	public static void main(String[] args) throws IOException {
		
		Song s = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		s.show();
		
		cio.brc();
		cio.bwc();
	}
}
