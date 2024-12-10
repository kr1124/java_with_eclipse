package arraytwo;

import java.io.*;

public class ArrayEx01 {
    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[5][5];

        for (int i = 0; i <= 24; i++) {
            arr[i / 5][i % 5] = i + 1;
        }

        for (int i = 0; i < 5; i++) {
        	for(int j = 0; j< 5; j++) {
        		bw.write(arr[i][j] + " ");
        	}
        	bw.write("\n");
        }

        bw.close();
        br.close();
    }
}
