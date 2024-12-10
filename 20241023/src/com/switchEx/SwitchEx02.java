package com.switchEx;

import java.util.*;

public class SwitchEx02 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("월 입력 : ");
        String order = sc.next();
        int price = 0;
                
        switch (order) {
	    	case "에스프레소":
	    	case "카푸치노":
	    	case "카페라떼":
	    		price = 3500;
	    		break;
	    	default:
	    		break;
        }
        
        System.out.println(price);
		
		sc.close();
	}
}
