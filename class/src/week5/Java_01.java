package week5;

import java.util.Arrays;
import java.util.Scanner;

public class Java_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");
        Integer[] result = {1, 1};

        for (int i = 0; i < arr.length; i++) {
            Integer[] dis = getDirection(arr[i]);
            if (!((result[0] < 2 && dis[0] < 0) || (result[0] > N - 1 && dis[0] > 0))) {
                result[0] += dis[0];
            }
            if (!((result[1] < 2 && dis[1] < 0) || (result[1] > N - 1 && dis[1] > 0))) {
                result[1] += dis[1];
            }
        }
        System.out.println(Arrays.toString(result));
    }
    public static Integer[] getDirection(String direction) {
        Integer[] result = new Integer[2];
        result[0] = 0;
        result[1] = 0;

        if (direction != null && direction.length() > 0) {
            switch (direction) {
                case "L":
                    result[0] = 0;
                    result[1] = -1;
                    break;
                case "R":
                    result[0] = 0;
                    result[1] = 1;
                    break;
                case "U":
                    result[0] = -1;
                    result[1] = 0;
                    break;
                case "D":
                    result[0] = 1;
                    result[1] = 0;
                    break;
            }
        }
        return result;
    }

}
