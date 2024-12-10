package com.arraythree;

import java.io.*;

/*
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * 
 * src : original array
 * srcPos : copy start index
 * dest : 복사 될 배열
 * destPos : 복사 시작위치
 * length : 복사할 개수, 인덱스 넘어가면 Exception 발생
 */

public class ArrayEx02 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] src = {"JAVA", "Database", "JSP", "Spring"};
        String[] dest = new String[6];
        dest[0] = "OS";
        dest[1] = "Network";
        
        System.arraycopy(src, 1, dest, 1, 3);
        
        for(int i = 0; i < dest.length; i++) {
        	bw.write(dest[i] + "\n");
        }
        
        
        bw.close();
        br.close();
    }
}
