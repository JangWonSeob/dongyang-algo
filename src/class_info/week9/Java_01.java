package class_info.week9;

import java.util.Scanner;

public class Java_01 {
    // 비트 연산자
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        if (isXorEven(n)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static boolean isEven(int n) {
        return (n & 1) != 1;
    }
    public static boolean isXorEven(int n) {
        boolean result = false;
        if ((n ^ 1) == (n + 1)) {
            result = true;
        }
        return result;
    }

}
