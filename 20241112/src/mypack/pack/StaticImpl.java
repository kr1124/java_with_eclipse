package mypack.pack;

//static import -> 상수나 static 선언된 것들을 클래스명, 상수로 접근했는데
//이거 쓰면 간단히 가능

import static java.lang.Math.*;
import static buf.cio.*;

public class StaticImpl {
	public static void main(String[] args) {
		int i = (int)(random() * 26) + 65;
		w("dflk");
	}
	
}
