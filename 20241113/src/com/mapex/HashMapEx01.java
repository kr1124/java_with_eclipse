package com.mapex;

import java.util.*;

import buf.cio;

public class HashMapEx01 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myID", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "2314");
		
		while(true) {
			cio.wnl("���̵�� ��й�ȣ�� �Է��Ͻʽÿ�.");
			cio.wf("���̵� : ");
			String id = cio.rl();
			cio.wf("��й�ȣ : ");
			String pw = cio.rl();
			
			cio.nlf();
			
			if(!map.containsKey(id)) {
				cio.wnlf("�Է��� ���̵�� �������� �ʴ� ���̵��Դϴ�.");
				continue;
			}
			if(!map.get(id).equals(pw)) {
				cio.wnlf("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				continue;
			}
			cio.wnlf("���̵�� ��й�ȣ�� ��ġ�մϴ�");
			break;
		}
	
	}
	

}
