package com.starex;

import buf.cio;

public class SeigeTank extends Unit {
	boolean isSeigeMode = false;
	
	@Override
	void move(int x, int y) {
		cio.wnlf("Move It! SeigeTank ==> x:" + x + ", y:" + y);
	}
	@Override
	void stop() {
		cio.wnlf("Destination?");
	}
	@Override
	void message() {
		cio.wnlf("Message : Go, Siege!");
	}
	
	void changeMode() {
		isSeigeMode = !isSeigeMode;
		cio.wnlf("Yes, Sir!");
	}
}
