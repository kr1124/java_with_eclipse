package com.mapex;

import java.util.HashSet;
import java.util.Iterator;

import buf.cio;

class AData {
	int x;
	int y;
	
	public AData(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void disp() {
		cio.wnlf(x + ", " + y);
	}
}

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AData ap = new AData(10, 20);
		AData bp = new AData(20, 20);
		AData cp = new AData(30, 20);

		//HashSet hs = new HashSet<>();
		HashSet<AData> hs = new HashSet<>();
		hs.add(ap);
		hs.add(bp);
		hs.add(cp);
		
		cio.wnlf("총 데이터 크기 : " + hs.size());
		
		Iterator<AData> it = hs.iterator();
		
		while(it.hasNext()) {
			it.next().disp();
		}
	}

}
