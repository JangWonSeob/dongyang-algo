package class_info.week14;

import java.util.Scanner;

public class Java_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] sum = new int[n + 1];
        int sumValue = 0;
        for (int i = 0; i < n; i++) {
            sumValue += sc.nextInt();
            sum[i + 1] = sumValue;
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(sum[end] - sum[start - 1]);
        }
    }
}
