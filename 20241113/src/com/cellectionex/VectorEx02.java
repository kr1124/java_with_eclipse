package com.cellectionex;

import java.util.Iterator;
import java.util.Vector;

class MyVector extends Vector<Object> {
	public MyVector() {
		super(1, 1);
	}
	
	public void write() {
		Object o;
		int lenght = size();
//		System.out.println("number of vector : " + length);
//		
//		for (int i = 0; i < array.length; i++) {
//			o = elementAt(i);
//			
//			if(o instanceof char[]) {
//				System.out.println("char array : " + String.copyValueOf(char[]) o);
//			}
//		}
	}
}

public class VectorEx02 {

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
