package class_info.week13;

public class Java_02 {
    // 소수 구하기
    public static void main(String[] args) {
        int m = 3;
        int n = 16;
        boolean[] result = new boolean[n + 1];

        // 소수 찾기
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!result[i]) {
                for (int j = 2; i * j <= n; j++) {
                    result[i * j] = true;
                }
            }
        }

//        // m 이하 모두 소수 X
//        for (int i = 0; i < m; i++) {
//            result[i] = true;
//        }

        for (int i = m; i < n; i++) {
            if (!result[i]) {
                System.out.println(i);
            }
        }
    }
}
