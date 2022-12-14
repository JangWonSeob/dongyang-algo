package study_info.week9;

import java.util.Scanner;

public class Java_02 {
    // 대소문자 바꾸기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // CheRry
        System.out.println("Original Input: " + input);
        System.out.println("toggleCase Input: " + toggleCase(input));
    }

    public static String toggleCase(String str) {
        String result = "";

        for (char x: str.toCharArray()) {
            result += (x ^= 32);
        }

        return result;
    }
}
