package personal;

import java.io.*;

public class Star10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        double n = Math.pow(3, k);

        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tc = 1;
                boolean is_blank = false;

                for (int l = 0; l < k; l++) {
                    if((i / tc) % 3 == 1 && (j / tc) % 3 == 1) {
                        is_blank = true;
                        break;
                    }
                    tc *= 3;
                }

                if(is_blank) {
                    bw.write(" ");
                }
                else {
                    bw.write("*");
                }
            }
            bw.write("\n");
        }*/

        String result = "";

        for (int i = 0; i < n * n; i++) {
            int j = (int)(i / n);
            int tc = 1;
            boolean isBlank = false;

            for (int l = 0; l < k; l++) {
                int a = 23;

                if((i / tc) % 3 == 1 && (j / tc) % 3 == 1) {

                    isBlank = true;
                    break;
                }
                tc *= 3;
            }

            if(isBlank) {
                result += " ";
            }
            else {
                result += "*";
            }

            if(i % n == n - 1) {
                result += "\n";
            }

        }

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
