package com.objex;

import java.io.*;
import com.classex.*;

public class ClassEx01 {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Tv tv01 = new Tv();
        Tv tv02 = new Tv();
        bw.write("tv02�� ä���� " + tv02.channel + "�� �Դϴ�.");
        bw.newLine();
        
        tv01.channel = 7;
        tv01.channelUp();
        bw.write("tv01�� ä���� " + tv01.channel + "�� �Դϴ�.");
        
        bw.close();
        br.close();
    }
}
