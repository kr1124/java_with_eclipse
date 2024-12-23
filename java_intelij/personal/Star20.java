package personal;

import java.io.*;

public class Star20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if(i % 2 == 1) {
                bw.write(" ");
            }
            for (int j = 0; j < n; j++) {
                bw.write("*");
                bw.write(" ");
            }
            bw.write("\n");
        }

        bw.close();
        br.close();
    }
}
