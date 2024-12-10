package com.switchEx;

import java.util.*;

public class SwitchEx03 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("가위바위보 : ");
        String rsp = sc.next();
        
        int computer = (int)(Math.random() * 3);
        String com_rsp = "";
        int human = -1;
        
        switch (rsp) {
	    	case "가위":
	    		human = 2;
	    		break;
	    	case "바위":
	    		human = 1;
	    		break;
	    	case "보":
	    		human = 0;
	    		break;
	    	default:
	    		break;
        }

        switch (computer) {
	    	case 0:
	    		com_rsp = "가위";
	    		break;
	    	case 1:
	    		com_rsp = "바위";
	    		break;
	    	case 2:
	    		com_rsp = "보";
	    		break;
	    	default:
	    		break;
        }
        
        int result = computer + human;
        String result_str = "";
        
        switch (result % 3) {
	    	case 0:
	    		result_str = "컴퓨터의 승리입니다.";
	    		break;
	    	case 1:
	    		result_str = "당신의 승리입니다.";
	    		break;
	    	case 2:
	    		result_str = "비겼습니다.";
	    		break;
        }
        
        if(human == -1) {
        	System.out.println("가위 바위 보 중에서 골라주십시오.");
        }
        else {
            System.out.println("컴퓨터 : " + com_rsp);
            System.out.println(result_str);
        }
		
		sc.close();
	}
}
