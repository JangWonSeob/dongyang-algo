package class_info.week3;

import java.util.Arrays;
import java.util.Scanner;

public class Java_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        Arrays.sort(P);

        int beforeTime = 0;

        for (int i = 0; i < N; i++) {
            result += (beforeTime + P[i]);
            beforeTime += P[i];
        }

        System.out.println(result);
    }
}
