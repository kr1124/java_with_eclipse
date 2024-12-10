package com.starex;

import buf.cio;

public class UseGame {

	public static void main(String[] args) {
		Unit[] un = new Unit[3];
		un[0] = new Marine();
		un[1] = new SeigeTank();
		un[2] = new Dropship();

		for (int i = 0; i < un.length; i++) {
			cio.wnlf("============");
			un[i].move(100, 200);
			un[i].message();
			cio.wnlf("============");
			cio.nlf();
		}
	}

}
