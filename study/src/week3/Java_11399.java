package week3;

import java.util.Arrays;
import java.util.Scanner;

public class Java_11399 {
    // ATM 기기 문제 - 모든 사람에 기다리는 시간 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        Arrays.sort(P);
        int num = 0;
        for (int i = 0; i < N; i++) {
            result += (P[i] + num);
            num += P[i];
        }
        System.out.println(result);
    }
}
