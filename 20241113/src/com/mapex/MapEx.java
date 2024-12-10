package com.mapex;

import java.util.HashMap;
import java.util.Set;

import buf.cio;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] msg = {"berlin", "dortmund", "frankfurt", "gelsenkirchen", "harburg"};
		
		HashMap<Integer, String> map = new HashMap<>();
		
		for (int i = 0; i < msg.length; i++) {
			map.put(i, msg[i]);
		}
		
		Set<Integer> keys = map.keySet();
		
		for (Integer n : keys) {
			cio.wnlf(map.get(n));
		}
	}

}
