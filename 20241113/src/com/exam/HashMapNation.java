package com.exam;

import java.util.HashMap;

import buf.cio;

public class HashMapNation {

	public static void main(String[] args) {

		//HashMap<String, Integer> nation = new HashMap<String, Integer>();
		HashMap<String, String> nation = new HashMap<String, String>();
		
		cio.wnlf("나라 이름과 인구를 입력하세요 (ex : korea 5000");
		while(true) {
			cio.wf("나라 이름, 인구 : ");
			String str = cio.rlsa()[0];
			String n = cio.rlsa()[1];
			
			if(str.equals("그만")) {
				break;
			}			

			nation.put(str, n);
		}
		
		while(true) {
			cio.wf("인구 검색 : ");
			String str = cio.rl();
			
			if(str.equals("그만")) {
				break;
			}
			
			cio.wnlf(str + "의 인구는 " + nation.get(str));
		}
	}

}
