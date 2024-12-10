package arraytwo;

import java.io.*;

public class ArrayEx08 {
	static int row = 4;
	static int col = 2;
    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[row][];

        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[2];

        for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < arr[i].length; j++) {
        		arr[i][j] = (i + 1) * 10 + j;
        		bw.write(arr[i][j] + " ");
        	}
        	bw.newLine();
        }
        
        bw.close();
        br.close();
    }
}
