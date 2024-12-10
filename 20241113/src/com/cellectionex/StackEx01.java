package com.cellectionex;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		Stack<String> myStack = new Stack<>();

		String str1 = "1-aaa";
		String str2 = "2-aaa";
		String str3 = "3-aaa";
		String str4 = "4-aaa";

		myStack.add(str1);
		myStack.add(str2);
		myStack.push(str3);
		myStack.push(str4);
		myStack.add("a");
		
		myStack.peek();
		
		myStack.pop();

		while(!myStack.isEmpty()) {
			String result1 = myStack.pop();
			System.out.println(result1);
		}

	}

}
