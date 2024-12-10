package com.objex;

import java.io.*;
import com.classex.*;

public class ClassEx01 {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Tv tv01 = new Tv();
        Tv tv02 = new Tv();
        bw.write("tv02의 채널은 " + tv02.channel + "번 입니다.");
        bw.newLine();
        
        tv01.channel = 7;
        tv01.channelUp();
        bw.write("tv01의 채널은 " + tv01.channel + "번 입니다.");
        
        bw.close();
        br.close();
    }
}
