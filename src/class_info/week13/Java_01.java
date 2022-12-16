package class_info.week13;

public class Java_01 {
    // 소수의 판별 | 시간복잡도: O(√N)
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(4));
        System.out.println(isPrimeNumber(7));
    }

    public static boolean isPrimeNumber(int x) {
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
