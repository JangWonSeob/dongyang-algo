package class_info.week5;

import java.util.Scanner;

public class Java_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] input = sc.nextLine().split("");
        Integer[] result = new Integer[]{1, 1};
        int count = 0;

        for (int i = 0; i < x.length; i++) {
            if (input[0].equals(x[i])) {
                result[0] = i + 1;
                result[1] = Integer.parseInt(input[1]);
                break;
            }
        }

        int [][] step = new int[][]{{-2, -1}, {-2, 1}, {2, -1}, {2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}};

        for(int i = 0; i < step.length; i++) {
            result[0] += step[i][0];
            result[1] += step[i][1];
            if (checkInner(result[0], result[1])) {
                count += 1;
            }
            initResult(result, step[i][0], step[i][1]);
        }
        System.out.println(count);
    }

    private static void initResult(Integer[] result, int x, int y) {
        result[0] += x * -1;
        result[1] += y * -1;
    }

    private static boolean checkInner(int x, int y) {
        boolean result = false;
        if ((0 < x && x < 9) && (0 < y && y < 9)) {
            result = true;
        }
        return result;
    }

}
