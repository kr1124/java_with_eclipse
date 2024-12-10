package arraytwo;

import java.io.*;

public class ArrayEx04 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[6][5];

        for (int i = 0; i < 5; i++) {
    		bw.write(i + "번 학생 - \n");
    		bw.flush();
        	for(int j = 0; j < 3; j++) {
        		bw.write("\t점수 입력 : ");
        		bw.flush();
        		arr[i][j] = Integer.parseInt(br.readLine());
        		arr[i][3] += arr[i][j];
        	}
        	arr[i][4] = (int)(arr[i][3] / 3);
        	arr[5][0] += arr[i][0];
        	arr[5][1] += arr[i][1];
        	arr[5][2] += arr[i][2];
        }

        for (int i = 0; i < 6; i++) {
        	
        	for(int j = 0; j< 5; j++) {
        		bw.write(arr[i][j] + " ");
        	}
        	bw.write("\n");
        }

        bw.close();
        br.close();
    }
}
