package com.starex;

import buf.cio;

public class Marine extends Unit {
	@Override
	void move(int x, int y) {
		cio.wnlf("������ ��ġ �̵� ��ǥ�� x:" + x + ", y:" + y + " �Դϴ�.");
	}
	@Override
	void stop() {
		cio.wnlf("������ ��� ���¿� �ֽ��ϴ�.");
	}
	@Override
	void message() {
		cio.wnlf("Message : Standing back ...");
	}
	
	void stimPack() {
		cio.wnlf("������ �������� ����Ѵ�.");
	}
}
