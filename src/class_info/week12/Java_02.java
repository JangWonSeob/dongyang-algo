package class_info.week12;

import java.util.Arrays;
import java.util.Scanner;

public class Java_02 {
    // 문자열 재정렬 : 문제 조건
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int value = 0;
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (48 <= x && x <= 57) {
                value += x - '0';
            } else {
                result += x;
            }
        }

        char[] charArr = result.toCharArray();
        Arrays.sort(charArr);
        result = new String(charArr) + value;
        System.out.println(result);
    }
}
