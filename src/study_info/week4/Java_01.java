package study_info.week4;

import java.util.Arrays;

public class Java_01 {
    // 0 뒤로 배치
    public static void main(String[] args) {
        int[] arr = { 6, 0, 8, 2, 3, 0, 4, 0, 1};

        int j = 0;
        for (int x: arr) {
            if (x != 0) {
                arr[j] = x;
                j++;
            }
        }

        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
