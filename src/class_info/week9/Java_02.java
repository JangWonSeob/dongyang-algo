package class_info.week9;

import java.util.Scanner;

public class Java_02 {
    // 대소문자 바꾸기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
//        String str = "CheRry";

        System.out.println("original String: " + str);
        System.out.println("toggleCase: " + toggleCase(str));
    }

    public static String toggleCase(String str) {

        String result = "";

        if (str.length() > 0) {
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                result += (arr[i] ^= 32);
            }
        }

        return result;
    }

}
