package com.exam;

import java.util.*;
import buf.cio;

public class StackApp {
	public static void main(String[] args) {
		cio.wnlf("총 스택의 저장 공간의 크기 입력 : ");
		int n = cio.rli();
		
		StringStack s = new StringStack(n);
		
		while(true) {
			cio.wf("문자열 입력 : ");
			String str = cio.rl();
			
			if(str.equals("그만")) {
				break;
			}
			
			boolean res = s.push(str);
			if(!res) {
				cio.wnlf("스택이 꽉 참");
			}
		}
		
		cio.wnlf("스택에 저장된 모든 문자열");
		int len = s.length();
		for (int i = 0; i < len; i++) {
			cio.w(s.pop() + " ");
		}
		cio.f();
	}
}
