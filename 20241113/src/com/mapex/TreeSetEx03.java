package com.mapex;

import java.util.*;

import buf.cio;

public class TreeSetEx03 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for (int i = 0; i < score.length; i++) {
			set.add(score[i]);
		}
		cio.wnlf("50���� ���� �� : " + set.headSet(50));
		cio.wnlf("50���� ū �� : " + set.tailSet(50));
		
	}

}
