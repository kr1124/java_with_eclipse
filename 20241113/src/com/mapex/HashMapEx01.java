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
			cio.wnl("아이디와 비밀번호를 입력하십시오.");
			cio.wf("아이디 : ");
			String id = cio.rl();
			cio.wf("비밀번호 : ");
			String pw = cio.rl();
			
			cio.nlf();
			
			if(!map.containsKey(id)) {
				cio.wnlf("입력한 아이디는 존재하지 않는 아이디입니다.");
				continue;
			}
			if(!map.get(id).equals(pw)) {
				cio.wnlf("비밀번호가 일치하지 않습니다.");
				continue;
			}
			cio.wnlf("아이디와 비밀번호가 일치합니다");
			break;
		}
	
	}
	

}
