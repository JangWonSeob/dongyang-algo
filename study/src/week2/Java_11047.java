package week2;

import java.util.Scanner;

public class Java_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, K, result = 0;
        N = sc.nextInt();
        K = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = N - 1; 0 <= i; i--) {
            result += K / arr[i];
            K = K % arr[i];
            if (K <= 0) {
                break;
            }
        }

        System.out.println("result = " + result);
    }
}
