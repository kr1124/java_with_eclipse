package com.exam;

import java.util.*;
import buf.cio;

public class StackApp {
	public static void main(String[] args) {
		cio.wnlf("�� ������ ���� ������ ũ�� �Է� : ");
		int n = cio.rli();
		
		StringStack s = new StringStack(n);
		
		while(true) {
			cio.wf("���ڿ� �Է� : ");
			String str = cio.rl();
			
			if(str.equals("�׸�")) {
				break;
			}
			
			boolean res = s.push(str);
			if(!res) {
				cio.wnlf("������ �� ��");
			}
		}
		
		cio.wnlf("���ÿ� ����� ��� ���ڿ�");
		int len = s.length();
		for (int i = 0; i < len; i++) {
			cio.w(s.pop() + " ");
		}
		cio.f();
	}
}
