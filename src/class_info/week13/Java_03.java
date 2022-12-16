package class_info.week13;

import java.util.Scanner;

public class Java_03 {
    // 소수 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        String[] arr = convertKbinary(n, k).split("0");
        for (int i = 0; i < arr.length; i++) {

            try {
                if (isPrimeNumber(Integer.parseInt(arr[i]))) {
                    count += 1;
                }
            } catch (Exception e) {

            }
        }
        System.out.println(count);
    }

    public static String convertKbinary(int n, int k) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % k);
            n /= k;
        }
        sb = sb.reverse();
        return sb.toString();
    }

    public static boolean isPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }



}
