package study_info.week3;

import java.util.Scanner;

public class Java_02 {
    // 각 숫자의 최대값 구하기(방식 +,x)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int result = 0;

        for (int i = 0; i < S.length(); i++) {
            int x = S.charAt(i) - '0';
            if (result < 1 || x < 1) {
                result += x;
            } else {
                result *= x;
            }
        }
        System.out.println(result);
    }
}
