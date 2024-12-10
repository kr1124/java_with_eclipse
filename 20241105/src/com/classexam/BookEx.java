package com.classexam;

import java.io.IOException;
import buf.cio;

public class BookEx {

	public static void main(String[] args) throws IOException {
		Book b = new Book();
		b.name = "홍길동전";
		b.writer = "작자미상";
		b.price = 10000;
		
		cio.bww(b.price + "");
		String ta = cio.brrl();
		cio.bww(ta);
		cio.bwf();
		
		cio.bwc();
		cio.brc();
	}

}
