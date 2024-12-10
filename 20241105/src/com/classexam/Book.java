package com.classexam;

public class Book {
	String name;
	String writer;
	int price;
	
	int nowPage;
	String isbn;
	
	public Book() {
		
	}
	
	public void nextPage() {
		nowPage++;
	}
	public void prePage() {
		nowPage--;
	}
	
}
