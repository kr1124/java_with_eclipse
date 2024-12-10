package personal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Matches {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        int nl = Integer.parseInt(N);
        int[] tc = new int[nl];

        for (int i = 0; i < nl; i++) {
            String tn = br.readLine();
            tc[i] = Integer.parseInt(tn);
        }

        //1 2 3 4 5 6 7 8 9 0
        //2 5 5 4 5 6 3 7 6 6
        /*
        * 2 -> 1
        * 3 -> 7
        * 4 -> 4
        * 5 -> 2
        * 6 -> 6 / 0
        * 7 -> 8
        * */

        br.close();

        for (int i = 0; i < nl; i++) {

        }

        bw.write("int");
        bw.flush();
        bw.close();
    }
}