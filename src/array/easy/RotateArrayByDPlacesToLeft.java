package array.easy;

import java.util.Arrays;

public class RotateArrayByDPlacesToLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int k) {
        int[] temp = new int[k];
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            temp[k - i - 1] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[n - i - 1] = temp[i];
        }
    }
}
