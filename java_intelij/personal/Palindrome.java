package personal;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();

        String[] sp = str.split("");

        int result = 1;
        for (int i = 0; i < str.length() / 2; i++) {
            String a = sp[i];
            String b = sp[str.length() - i - 1];
            if(!a.equals(b)) {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}
