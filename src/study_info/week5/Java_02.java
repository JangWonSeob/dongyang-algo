package study_info.week5;

import java.util.Scanner;

public class Java_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("");

        String[] x = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] y = {"1", "2", "3", "4", "5", "6", "7", "8"};

        int[] dx = {-1, -1, 1, 1, -2, -2, 2, 2};
        int[] dy = {-2, 2, -2, 2, -1, 1, -1, 1};
        int[] location = new int[2];
        int result = 0;

        // 위치 탐색
        for (int i = 0; i < 8; i++) {
            if (input[0].equals(x[i])) {
                location[1] = i + 1;
            }
            if (input[1].equals(y[i])) {
                location[0] = i + 1;
            }
        }

        // 이동 가능 여부 확인
        for (int i = 0; i < 8; i++) {
            int tempX = location[0] + dx[i];
            int tempY = location[1] + dy[i];

            if ((0 < tempX && tempX < 9) && (0 < tempY && tempY < 9)) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
