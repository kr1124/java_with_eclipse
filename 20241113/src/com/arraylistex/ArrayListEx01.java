package com.arraylistex;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import buf.cio;

public class ArrayListEx01 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("asdf");
		list1.add("zxcv");
		
		List<String> list2 = new ArrayList<String>(list1);
		list2.add("qwer");
		
		List<String> list3 = new ArrayList<String>();
		list3.addAll(list2);
		
		int n = list3.indexOf("qwer");
		cio.wnlf(n);
		
		list3.add(n + 1, "uiop");
		cio.wnlf(list3.toString());
		
		ListIterator<String> it = list3.listIterator();
		
		while(it.hasNext()) {
			cio.wnlf(it.next() + " ");
		}
		cio.nlf();
		
		while(it.hasPrevious()) {
			cio.wnlf(it.previous() + " ");
		}
		
		
	}
}
