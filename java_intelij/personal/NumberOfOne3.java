package personal;

import java.io.*;

public class NumberOfOne3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputs = br.readLine();
        String[] temp_inputs = inputs.split(" ");
        int a = Integer.parseInt(temp_inputs[0]);
        int b = Integer.parseInt(temp_inputs[1]);
        int k = Integer.parseInt(temp_inputs[2]);
        int count = 0;
        int multiplier = 1;

        while(b > 0) {
            int a_1 = a % 10;
            int b_1 = b % 10;

            int num_between_ab = b - a + 1;
            count += num_between_ab / 10;
            // a1 1 b1 2 -> 12
            // a1 1 b1 7 -> 1234567
            // a1 1 b1 0 ->
            // a1 1 b1 1 -> 1
            // a1 1 b1 9 -> 123456789
            // a1 7 b1 3 -> 7890123
            // a1 7 b1 7 -> 7
            // a1 7 b1 6 -> 한 사이클
            // a1 7 b1 5 -> 789012345
            if(b_1 < a_1) {
                b_1 += 10;
            }

            if (k >= a_1 && k <= b_1) {
                count++;
            }

            a /= 10;
            b /= 10;
            multiplier *= 10;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }
}
