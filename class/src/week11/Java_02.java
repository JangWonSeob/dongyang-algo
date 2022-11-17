package week11;

import java.util.Scanner;

public class Java_02 {
    // 문자열 압축
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String str = "abcabcabcabcdededededede";
        String str = sc.nextLine();

        String result = str;
        for (int i = 1; i <= str.length() / 2; i++) {
            String current, next = "", tmpResult = "";
            int count = 1;
            for (int j = 0; j <= str.length() / i; j++) {
                current = next;

                int start = j * i;
                int end = Math.min(i * (j + 1), str.length());
                next = str.substring(start, end);

                if (current.equals(next)) {
                    count++;
                } else {
                    tmpResult += count < 2 ? current : (count + current);
                    count = 1;
                }
            }

            tmpResult += count < 2 ? next : (count + next);
            if (tmpResult.length() < result.length()) {
                result = tmpResult;
            }
        }
//        System.out.println(result);
        System.out.println(result.length());
    }
}
