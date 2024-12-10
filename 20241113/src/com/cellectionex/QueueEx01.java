package com.cellectionex;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {
	public static void main(String[] args) {
		Queue<Object> myQueue = new LinkedList<>();
		
		String str1 = "1-aaa";
		String str2 = "2-aaa";
		String str3 = "3-aaa";
		String str4 = "4-aaa";

		myQueue.offer(str1);
		myQueue.offer(str2);
		myQueue.offer(str3);
		myQueue.offer(str4);
		
		System.out.println("value 1 : " + myQueue.element());
		System.out.println("value 1 : " + myQueue.peek());
		System.out.println();
		
		String val;
		
		while(!myQueue.isEmpty()) {
			val = (String)myQueue.poll();
			System.out.println("value : " + val);
		}
	}
}
