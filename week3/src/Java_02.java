import java.util.Scanner;

public class Java_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        long result = Character.getNumericValue(N.charAt(0));

        for (int i = 1; i < N.length(); i++) {
            int num = Character.getNumericValue(N.charAt(i));
            if (result < 1) {
                result += num;
            } else if (num < 2) {
                result += num;
            } else {
                result *= num;
            }
        }

        System.out.println(result);
    }
}
