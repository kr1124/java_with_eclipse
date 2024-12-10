package personal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StarNew {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String type = br.readLine();
        //1 -> ㄴ
        //2 -> _|
        //3 -> ┌
        //4 -> ㄱ

        String n = br.readLine();
        br.close();
        int nl = Integer.parseInt(n);

        String star = "★";
        String space = "□";

        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < i + 1; j++) {
                bw.write(star);
            }
            for (int j = nl - i - 1; j > 0; j--) {
                bw.write(space);
            }
            bw.write("\n");
        }
        bw.write("\n");
        bw.write("\n");
        for (int i = 0; i < nl; i++) {
            for (int j = nl - i - 1; j > 0; j--) {
                bw.write(space);
            }
            for (int j = 0; j < i + 1; j++) {
                bw.write(star);
            }
            bw.write("\n");
        }
        bw.write("\n");
        bw.write("\n");
        for (int i = 0; i < nl; i++) {
            for (int j = nl - i; j > 0; j--) {
                bw.write(star);
            }
            for (int j = 0; j < i; j++) {
                bw.write(space);
            }
            bw.write("\n");
        }
        bw.write("\n");
        bw.write("\n");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < i; j++) {
                bw.write(space);
            }
            for (int j = nl - i; j > 0; j--) {
                bw.write(star);
            }
            bw.write("\n");
        }



        bw.flush();
        bw.close();
    }
}
