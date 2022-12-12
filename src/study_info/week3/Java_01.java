package study_info.week3;

import java.util.Scanner;

public class Java_01 {
    // 입력 값이 1이 될 때까지 (방식 /, -1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 0;

        while (N >= K) {
            result += N % K;
            N /= K;
            result += 1;
        }
        result += (N - 1);
        System.out.println(result);
    }
}
