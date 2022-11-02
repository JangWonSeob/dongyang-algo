package week2;

import java.util.Scanner;

public class Java_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int count = 0;
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for(int i = N-1; 0 <= i; i--) {
            count += K / A[i];
            K = K % A[i];
            if (K == 0) {
                break;
            }
        }
        System.out.println(count);
    }
}
