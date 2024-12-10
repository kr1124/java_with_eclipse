package com.cellectionex;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	private static final String[] Colors = {"black", "yellow", "green", "blue", "red"};
	

	public static void main(String[] args) {
		
		String str;
		
		Vector<String> v = new Vector<String>();
		
		for (int i = 0; i < Colors.length; i++) {
			v.add(Colors[i]);
		}

		str = v.firstElement();
		System.out.println("first element : " + str);
		str = v.get(0);
		System.out.println("first element : " + str);

		str = v.get(1);
		System.out.println("second element : " + str);
		str = v.elementAt(1);
		System.out.println("second element : " + str);
		
		str = v.lastElement();
		System.out.println("last element : " + str);
		
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()) {
			str = it.next();
			System.out.println(str + " ");
		}
		System.out.println();
		
		
	}

}
