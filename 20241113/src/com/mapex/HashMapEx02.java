package com.mapex;

import java.util.*;

import buf.cio;

public class HashMapEx02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("가길동", 90);
		map.put("나길동", 100);
		map.put("다길동", 60);
		map.put("라길동", 100);
		
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		
		while(it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			cio.wnlf("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
	
		Set set2 = map.keySet();
		cio.wnlf("참가자 명단 : " + set2);
		
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();
		while(it2.hasNext()) {
			cio.wnlf("점수 : " + it2.next());
		}
	}
	

}
