package com.switchEx;

import java.util.*;

public class SwitchEx02 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("�� �Է� : ");
        String order = sc.next();
        int price = 0;
                
        switch (order) {
	    	case "����������":
	    	case "īǪġ��":
	    	case "ī���":
	    		price = 3500;
	    		break;
	    	default:
	    		break;
        }
        
        System.out.println(price);
		
		sc.close();
	}
}
