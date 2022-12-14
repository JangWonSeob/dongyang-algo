package study_info.week9;

import java.util.Scanner;

public class Java_03 {
    // 가장 오른쪽 0값의 비트를 1로 바꾼 값 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(setRightmostUnsetBit(n));
    }

    public static int getPosOfRightmostSetBit(int n) {
        return (int) (Math.log10(~n & (n + 1)) / Math.log10(2));
    }

    public static int setRightmostUnsetBit(int n) {
        if (n == 0) {
            return 1;
        }

        // n의 모든 자리수가 1인 경우
        if ((n & (n + 1)) == 0) {
            return n;
        }

        return ((1 << getPosOfRightmostSetBit(n)) | n);
    }
}
