package com.mapex;

import java.util.*;

import buf.cio;

public class HashSetEx04 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setH = new HashSet();
		HashSet setK = new HashSet();
		HashSet setC = new HashSet();

		setA.add("1");setA.add("2");setA.add("3");setA.add("4");setA.add("5");
		cio.wnlf("A : " + setA);

		setB.add("4");setB.add("5");setB.add("6");setB.add("7");setB.add("8");
		cio.wnlf("B : " + setB);
		
		Iterator it = setB.iterator();
		
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp)) {
				setK.add(tmp);
			}
		}
		cio.wnlf("교집합 : " + setK);
		
		Iterator it2 = setA.iterator();
		while (it2.hasNext()) {
			Object tmp = it2.next();
			if(!setB.contains(tmp)) {
				setC.add(tmp);
			}
		}
		cio.wnlf("차집합 : " + setC);

		it = setA.iterator();
		it2 = setB.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
			setH.add(tmp);
		}
		while (it2.hasNext()) {
			Object tmp = it2.next();
			setH.add(tmp);
		}
		cio.wnlf("합집합 : " + setH);
	}

}
