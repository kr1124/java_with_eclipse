package com.switchEx;

import java.util.*;

public class SwitchEx03 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("���������� : ");
        String rsp = sc.next();
        
        int computer = (int)(Math.random() * 3);
        String com_rsp = "";
        int human = -1;
        
        switch (rsp) {
	    	case "����":
	    		human = 2;
	    		break;
	    	case "����":
	    		human = 1;
	    		break;
	    	case "��":
	    		human = 0;
	    		break;
	    	default:
	    		break;
        }

        switch (computer) {
	    	case 0:
	    		com_rsp = "����";
	    		break;
	    	case 1:
	    		com_rsp = "����";
	    		break;
	    	case 2:
	    		com_rsp = "��";
	    		break;
	    	default:
	    		break;
        }
        
        int result = computer + human;
        String result_str = "";
        
        switch (result % 3) {
	    	case 0:
	    		result_str = "��ǻ���� �¸��Դϴ�.";
	    		break;
	    	case 1:
	    		result_str = "����� �¸��Դϴ�.";
	    		break;
	    	case 2:
	    		result_str = "�����ϴ�.";
	    		break;
        }
        
        if(human == -1) {
        	System.out.println("���� ���� �� �߿��� ����ֽʽÿ�.");
        }
        else {
            System.out.println("��ǻ�� : " + com_rsp);
            System.out.println(result_str);
        }
		
		sc.close();
	}
}
