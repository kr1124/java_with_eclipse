package com.mapex;

import java.util.*;

import buf.cio;

public class HashMapEx02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("���浿", 90);
		map.put("���浿", 100);
		map.put("�ٱ浿", 60);
		map.put("��浿", 100);
		
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		
		while(it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			cio.wnlf("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}
	
		Set set2 = map.keySet();
		cio.wnlf("������ ��� : " + set2);
		
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();
		while(it2.hasNext()) {
			cio.wnlf("���� : " + it2.next());
		}
	}
	

}
