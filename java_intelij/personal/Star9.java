package personal;

import java.io.*;

public class Star9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n * 2 - 1; i++) {
            for(int j = 0; j < Math.abs(i - (n - 1)) * -1 + (n - 1); j++) {
                bw.write(" ");
            }
            for(int j = 0; j < Math.abs(i * 2 - n * 2 + 2) + 1; j++) {//(i * 2 - 1) - (2 * (n - 1) - 1)
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.close();
        br.close();
    }
}
