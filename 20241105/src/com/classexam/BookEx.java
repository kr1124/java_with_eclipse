package com.classexam;

import java.io.IOException;
import buf.cio;

public class BookEx {

	public static void main(String[] args) throws IOException {
		Book b = new Book();
		b.name = "ȫ�浿��";
		b.writer = "���ڹ̻�";
		b.price = 10000;
		
		cio.bww(b.price + "");
		String ta = cio.brrl();
		cio.bww(ta);
		cio.bwf();
		
		cio.bwc();
		cio.brc();
	}

}
