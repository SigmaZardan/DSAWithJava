package array.easy;

import java.util.Arrays;

public class RotateArrayByDPlacesToLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }


    // this is brute force approach which seems optimal in this case
    // O(3n) -> O(n) time complexity
    // O(k) extra space

    private static void rotate(int[] arr, int k) {
        int[] temp = new int[k];
        int n = arr.length;

        // populate all the elements from 0th index < k into the temporary array of size k
        // the numbers are added in reverse order in the temporary array
        for (int i = 0; i < k; i++) {
            temp[k - i - 1] = arr[i];
        }
        // left shift all the numbers from k < n
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        // finally populate the elements from the temporary array to the
        // input array from the last
        for (int i = 0; i < k; i++) {
            arr[n - i - 1] = temp[i];
        }
    }
}
