package com.starex;

import buf.cio;

public class Marine extends Unit {
	@Override
	void move(int x, int y) {
		cio.wnlf("마린의 위치 이동 좌표는 x:" + x + ", y:" + y + " 입니다.");
	}
	@Override
	void stop() {
		cio.wnlf("마린이 대기 상태에 있습니다.");
	}
	@Override
	void message() {
		cio.wnlf("Message : Standing back ...");
	}
	
	void stimPack() {
		cio.wnlf("마린이 스팀팩을 사용한다.");
	}
}
