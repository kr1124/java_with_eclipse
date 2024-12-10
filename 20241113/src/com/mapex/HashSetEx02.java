package com.mapex;

import java.util.*;

import buf.cio;

public class HashSetEx02 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; set.size() < 10 && i < 10; i++) {
			//int num = cio.cri(46);
			int num = cio.cri(3, 8);
			//int num = (int)(Math.random() * (45 + 1)) + 1;
			set.add(num);
			
			cio.wnlf(String.format("%-35s  %d", set.toString(), num));
			//System.out.println(set + "\t" + num);
		}
		
		System.out.println(set);
		//cio.wnlf(set.toString());
		
		
//		List list = new LinkedList(set);
//		
//		Collections.sort(list);
//		cio.wnlf(list.toString());
	}
}
