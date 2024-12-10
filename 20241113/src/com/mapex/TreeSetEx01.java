package com.mapex;

import java.util.*;

import buf.cio;

public class TreeSetEx01 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = cio.cri(1, 46);
			set.add(num);
		}
		cio.w(set);
		cio.wnlf(set.toString());
	}

}
