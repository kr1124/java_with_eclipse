package com.mapex;

import java.util.*;

import buf.cio;

public class HashMapEx03 {
	static HashMap phoneBook = new HashMap();

	static void	addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			cio.wnlf(" * " + e.getKey() + "[" + subSet.size() + "]");
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String name = (String)subE.getValue();
				String telNo = (String)subE.getKey();
				cio.wnlf(name + " " + telNo);
				
				//cio.wnlf(subIt.next().toString());
			}
			cio.nlf();
		}
	}
	
	public static void main(String[] args) {
		addPhoneNo("친구", "가길동", "010-1111-1111");
		addPhoneNo("친구", "이자바", "010-1111-2222");
		
		addPhoneNo("회사", "김자바", "010-3333-3333");
		addPhoneNo("회사", "김자바", "010-4444-4444");
		addPhoneNo("회사", "홍대리", "010-5555-5555");
		
		addPhoneNo("세탁소", "민세탁", "010-9999-9999");
				
		
		printList();
	}
	

}
