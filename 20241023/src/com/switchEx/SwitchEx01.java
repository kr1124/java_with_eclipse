package com.switchEx;

import java.util.*;

public class SwitchEx01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int month;		
		
        System.out.print("�� �Է� : ");
        month = sc.nextInt();

        String ms = "";
        
        switch (month) {
	    	case 12:
	    	case 1:
	    	case 2:
	    		ms = "�ܿ�";
	    		break;
	    	case 3:
	    	case 4:
	    	case 5:
	    		ms = "��";
	    		break;
	    	case 6:
	    	case 7:
	    	case 8:
	    		ms = "����";
	    		break;
	    	case 9:
	    	case 10:
	    	case 11:
	    		ms = "����";
	    		break;
	    	default:
	    		break;
        }
        
        System.out.println(ms);
		
		sc.close();
	}
}
