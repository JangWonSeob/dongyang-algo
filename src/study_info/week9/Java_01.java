package study_info.week9;

import java.util.Scanner;

public class Java_01 {
    // 비트 연산자(홀수, 짝수 구분)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        if (isXorEven(n)) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }


    }

    public static boolean isEven(int n) {
        return (n & 1) != 1;
    }

    public static boolean isXorEven(int n) {
        return (n ^ 1) == (n + 1);
    }

}
