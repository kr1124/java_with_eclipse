package com.mapex;

import java.util.*;

import buf.cio;

public class TreeMapEx {
	static class ValueComparator implements Comparator {
		@Override
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;

				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();
				
				return v2 - v1;
			}
			
			return 0;
		}
	}
		
	public static String printList(char ch, int value) {
		char[] bar = new char[value];
		
		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		
		return new String(bar);
	}
	
	public static void main(String[] args) {
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		
		TreeMap	map = new TreeMap();
		
		for (int i = 0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], value.intValue() + 1);
			}
			else {
				map.put(data[i], 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			
			cio.wnlf(entry.getKey() + " : " + printList('#', value) + " " + value);
			
		}
		
		Set set = map.entrySet();
		List list = new ArrayList(set);
		
		Collections.sort(list, new ValueComparator());
		
		it = list.iterator();
		cio.wnlf("내림차순 정렬");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			
			cio.wnlf(entry.getKey() + " : " + printList('#', value) + " " + value);
			
		}
		
	}
	

}
