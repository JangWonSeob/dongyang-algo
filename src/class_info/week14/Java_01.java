package class_info.week14;

public class Java_01 {
    // 배열의 모든 왼쪽 값은 자신의 값보다 작고, 모든 오른쪽 값은 자신의값보다 큰 항목 찾기
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        int n = arr.length;
        System.out.println(findElement(arr, n));
    }

    public static int findElement(int[] arr, int n) {
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.min(leftMax[i - 1], arr[i - 1]);
        }
        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            if (rightMin[i + 1] > arr[i + 1]) rightMin[i] = arr[i + 1];
            else rightMin[i] = rightMin[i + 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            if (leftMax[i] < arr[i] && rightMin[i] > arr[i]) return i;
            rightMin[i] = Math.min(rightMin[i], arr[i]);
        }

        return -1;
    }
}
