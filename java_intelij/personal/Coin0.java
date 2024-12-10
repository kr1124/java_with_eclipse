package personal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Coin0 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //https://www.acmicpc.net/problem/11047

        String NK = br.readLine();
        String[] nk = NK.split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] coin_value = new int[n];

        for (int i = 0; i < n; i++) {
            String tn = br.readLine();
            coin_value[i] = Integer.parseInt(tn);
        }

        br.close();

        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (k > coin_value[i]) {
                int q = k / coin_value[i];
                count += q;
                k %= coin_value[i];
            }
        }

        bw.write(count);
        bw.flush();
        bw.close();
    }
}