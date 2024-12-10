package com.starex;

import buf.cio;

public class Dropship extends Unit {
	@Override
	void move(int x, int y) {
		cio.wnlf("Take it slow. Dropship = > x:" + x + ", y:" + y + " ÀÔ´Ï´Ù.");
	}
	@Override
	void stop() {
		cio.wnlf("In the by, by, by, by");
	}
	@Override
	void message() {
		cio.wnlf("Message : Can I take orders.");
	}
	
}
