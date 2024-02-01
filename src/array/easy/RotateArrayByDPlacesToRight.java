package array.easy;

import java.util.Arrays;

public class RotateArrayByDPlacesToRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // Directly writing the optimal solution
        // first reverse array from 0 till n - 1
        // reverse from 0 till k - 1
        // reverse from k till n - 1

        rightRotate(arr, 3);
        System.out.println(Arrays.toString(arr));

    }
    private static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
