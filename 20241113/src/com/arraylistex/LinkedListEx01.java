package com.arraylistex;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import buf.cio;

public class LinkedListEx01 {

	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			list.add(i + "");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			list.add(500, "X");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i = list.size() - 1; i > 0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>(2000000);
		LinkedList ll = new LinkedList<>();

		cio.wnlf("== 순차적으로 추가 ==");
		cio.wnlf("ArrayList: " + add1(al));
		cio.wnlf("LinkedList: " + add1(ll));
		cio.nlf();
		cio.wnlf("== 중간에서 추가 ==");
		cio.wnlf("ArrayList: " + add2(al));
		cio.wnlf("LinkedList: " + add2(ll));
		cio.nlf();
//		cio.wnlf("== 순차적으로 삭제 ==");
//		cio.wnlf("ArrayList: " + remove1(al));
//		cio.wnlf("LinkedList: " + remove1(ll));
//		cio.nlf();
		cio.wnlf("== 중간에서 삭제 ==");
		cio.wnlf("ArrayList: " + remove2(al));
		cio.wnlf("LinkedList: " + remove2(ll));
		cio.nlf();
	}
}
