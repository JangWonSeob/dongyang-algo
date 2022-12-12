package class_info.week4;

import java.util.Arrays;

public class Java_01 {
    public static void main(String[] args) {
        int[] arr = { 6, 0, 8, 2, 3, 0, 4, 0, 1};

        int j = 0;
        for (int num: arr) {
            if (num != 0) {
                arr[j] = num;
                j++;
            }
        }

        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));

    }
}
