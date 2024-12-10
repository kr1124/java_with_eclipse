package com.cellectionex;

import java.util.Stack;

public class StackEx02 {

	private static final String[] Colors = {"black", "yellow", "green", "blue", "red"};
	
	public StackEx02() {
		Stack<String> st = new Stack<>();
		
		for(String color : Colors) {
			st.push(color);
		}
		
		System.out.println("pop : ");
		while(!st.empty()) {
			System.out.println(st.pop() + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		StackEx02 se2 = new StackEx02();
		String sss = Colors[1];
		Colors[1] = "342";
		Colors[3] = "342";
	}

}
