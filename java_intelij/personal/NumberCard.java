package personal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumberCard {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        String NC = br.readLine();
        String M = br.readLine();
        String MC = br.readLine();

        br.close();

        String[] nc = NC.split(" ");
        String[] mc = MC.split(" ");

        String result = "";

        for (int i = 0; i < Integer.parseInt(M); i++) {
            String count = "0";

            for (int j = 0; j < Integer.parseInt(N); j++) {
                String a = mc[i];
                String b = nc[j];
                if(a.equals(b)) {
                    count = "1";
                    break;
                }
            }
            result += count + " ";
        }

        bw.write(result.substring(0, result.length() - 1));

        bw.flush();
        bw.close();
    }
}
