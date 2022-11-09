package week10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java_01 {
    // 연결하여 만들 수 있는 가장 큰 수 찾기
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("10", "68", "75", "7", "21", "12");
        Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));
//        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
        }
    }
}
