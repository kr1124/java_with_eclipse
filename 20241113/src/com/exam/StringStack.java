package com.exam;

public class StringStack implements Stack {

	private String[] element;
	private int tos;//top_index

	public StringStack() {
		element = new String[capacity()];
		tos = -1;
	}
	public StringStack(int i) {
		element = new String[i];
		tos = -1;
	}
	
	@Override
	public int length() {
		return tos + 1;
	}

	@Override
	public int capacity() {
		return element.length;
	}

	@Override
	public String pop() {
		if(tos <= -1) {
			return null;
		}
		String s = element[tos--];
		
		return s;
	}

	@Override
	public boolean push(String val) {
		if(tos == element.length - 1) {
			return false; //저장 공간 꽉참
		}
		else {
			element[++tos] = val;
			return true;
		}
	}

}
