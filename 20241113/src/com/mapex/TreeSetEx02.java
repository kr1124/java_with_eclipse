package com.mapex;

import java.util.*;

import buf.cio;

public class TreeSetEx02 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from  = "b";
		String to = "d";

		set.add("abc");set.add("aid");set.add("bat");set.add("car");
		set.add("Car");set.add("dis");set.add("day");set.add("dzz");
		set.add("dZZ");set.add("elp");set.add("elv");set.add("fan");
		set.add("for");
		
		
		cio.wnlf(set.toString());
		cio.wnlf("result 1 : " + set.subSet(from, to));
		cio.wnlf("result 2 : " + set.subSet(from, to + "zz"));
	}

}
