package study_info.week5;

import java.util.Arrays;
import java.util.Scanner;

public class Java_01 {
    // 미로 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String[] d = {"U", "D", "L", "R"};
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int[] result = {1, 1};

        String[] arr = sc.nextLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            int tempX = result[0];
            int tempY = result[1];

            switch (arr[i]) {
                case "U":
                    tempX += dx[0];
                    tempY += dy[0];
                case "D":
                    tempX += dx[1];
                    tempY += dy[1];
                case "L":
                    tempX += dx[2];
                    tempY += dy[2];
                case "R":
                    tempX += dx[3];
                    tempY += dy[3];
            }

            if (tempX > 0 && tempX <= N && tempY > 0 && tempY <= N) {
                result[0] = tempX;
                result[1] = tempY;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
