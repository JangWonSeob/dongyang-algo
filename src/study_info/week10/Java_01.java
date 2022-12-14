package study_info.week10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java_01 {
    // 연결하여 만들 수 있는 가장 큰 수 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = Arrays.asList("10", "68", "75", "7", "21", "12");
        Collections.sort(input, (a, b) -> (b + a).compareTo(a + b));


    }
}
