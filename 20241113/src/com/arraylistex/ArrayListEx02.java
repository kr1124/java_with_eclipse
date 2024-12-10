package com.arraylistex;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import buf.cio;

public class ArrayListEx02 {
	public static void main(String[] args) {
		final int LIMIT = 10;
		
		String source = "0123456789abcdefghijklmnopqrstuvwxyz";
		
		int length = source.length();
		cio.wnlf(length);
		
		List list = new ArrayList<>(length / LIMIT + 10);
		
		for (int i = 0; i < length; i += LIMIT) {
			if(i + LIMIT < length) {
				list.add(source.substring(i, i + LIMIT));
			}
			else {
				list.add(source.substring(i));
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			cio.wnlf(list.get(i).toString());
		}
		
	}
}
