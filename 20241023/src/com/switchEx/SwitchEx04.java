package com.switchEx;

import java.util.*;

public class SwitchEx04 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("�ֹι�ȣ [123456-1234567] : ");
        String unique_code = sc.next();
        sc.close();
        
        char gender_code = unique_code.charAt(7);
        String gender = "";
        
        switch (gender_code % 2) {
	    	case 1:
	    		gender = "����";
	    		break;
	    	case 0:
	    		gender = "����";
	    		break;
	    	default:
	    		gender = "��ȿ���� ���� ��ȣ�Դϴ�.";
	    		break;
        }

        System.out.println(gender);
	}
}
