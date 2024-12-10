package com.switchEx;

import java.util.*;

public class SwitchEx04 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("주민번호 [123456-1234567] : ");
        String unique_code = sc.next();
        sc.close();
        
        char gender_code = unique_code.charAt(7);
        String gender = "";
        
        switch (gender_code % 2) {
	    	case 1:
	    		gender = "남성";
	    		break;
	    	case 0:
	    		gender = "여성";
	    		break;
	    	default:
	    		gender = "유효하지 않은 번호입니다.";
	    		break;
        }

        System.out.println(gender);
	}
}
