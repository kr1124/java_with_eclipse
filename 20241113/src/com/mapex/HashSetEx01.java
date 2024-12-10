package com.mapex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import buf.cio;

public class HashSetEx01 {
	public static void main(String[] args) {
		Object[] objArr = {"1", 1, "2", "3", 4, 4, "3", 3};
		
		Set set = new HashSet<>();
		
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		cio.wnlf(set.toString());
		
		Iterator<Object> it = set.iterator();
		
		while(it.hasNext()) {
			cio.wf(it.next() + " ");
		}
		
	}

}
