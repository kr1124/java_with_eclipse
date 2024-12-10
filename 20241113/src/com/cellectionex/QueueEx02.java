package com.cellectionex;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx02 {

	private static final String[] Colors = {"black", "yellow", "green", "blue", "red"};
	
	public static void main(String[] args) {
		
		Queue<Object> mq = new LinkedList<>();
		
		for(String color : Colors) {
			mq.offer(color);
			
			System.out.println("queue : ");
			while(mq.peek() != null) {
				System.out.println(mq.poll() + " ");
			}
		}
		System.out.println();
	}
}
