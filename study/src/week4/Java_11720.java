package week4;

import java.util.Scanner;

public class Java_11720 {
    // 각 숫자의 합 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int result = 0;

        for (int i = 0; i < N; i++) {
            result += str.charAt(i) - '0';
        }

        System.out.println(result);
    }
}
