package com.cellectionex;

import java.util.*;

import buf.cio;

public class VectorEx03 {

	private static final String[] Colors = {"black", "yellow", "green", "blue", "red"};
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		for(String s : Colors) {
			v.add(s);
		}
		
		cio.wnlf("첫번째 요소 : " + v.firstElement());
		cio.wnlf("두번째 요소 : " + v.get(1));
		cio.wnlf("마지막 요소 : " + v.lastElement());
		cio.wnlf("요소 개수 : " + v.size());

		v.set(0, "white");
		cio.wnlf("첫번째 요소 : " + v.firstElement());
		cio.wnlf("두번째 요소 : " + v.get(1));
		cio.wnlf("마지막 요소 : " + v.lastElement());
		cio.wnlf("요소 개수 : " + v.size());

		v.insertElementAt("skyblue", 0);
		cio.wnlf("첫번째 요소 : " + v.firstElement());
		cio.wnlf("두번째 요소 : " + v.get(1));
		cio.wnlf("마지막 요소 : " + v.lastElement());
		cio.wnlf("요소 개수 : " + v.size());
		
		cio.nlf();
		
		for(String s : v) {
			cio.wnl(s);
		}
		cio.nlf();
		
		Collections.sort(v);
		for(String s : v) {
			cio.wnl(s);
		}
		cio.nlf();
		
		Collections.sort(v, Collections.reverseOrder());
		for(String s : v) {
			cio.wnl(s);
		}
		cio.nlf();
		
		int idx = Collections.binarySearch(v, "blue");
		cio.wnlf("blue : " + idx);
		idx = Collections.binarySearch(v, "blue", Collections.reverseOrder());
		cio.wnlf("blue : " + idx);
		cio.nlf();
	}

}
