package com.exam;

import java.util.HashMap;

import buf.cio;

public class HashMapNation {

	public static void main(String[] args) {

		//HashMap<String, Integer> nation = new HashMap<String, Integer>();
		HashMap<String, String> nation = new HashMap<String, String>();
		
		cio.wnlf("���� �̸��� �α��� �Է��ϼ��� (ex : korea 5000");
		while(true) {
			cio.wf("���� �̸�, �α� : ");
			String str = cio.rlsa()[0];
			String n = cio.rlsa()[1];
			
			if(str.equals("�׸�")) {
				break;
			}			

			nation.put(str, n);
		}
		
		while(true) {
			cio.wf("�α� �˻� : ");
			String str = cio.rl();
			
			if(str.equals("�׸�")) {
				break;
			}
			
			cio.wnlf(str + "�� �α��� " + nation.get(str));
		}
	}

}
