import java.util.Scanner;

public class Java_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int sum = 0;

        if (n == arr.length) {
            for(int i = 0; i < n; i++) {
                sum += Integer.parseInt(String.valueOf(arr[i]));
            }
        }

        System.out.println(sum);
    }
}
