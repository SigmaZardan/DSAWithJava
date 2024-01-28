package array.easy;

import java.util.Arrays;

public class RotateArrayByDPlacesToLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        optimal(arr, 3);
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


    // optimal approach
    // what can be the optimal approach
    // write a reverse function
    // reverse array from 0 , k - 1
    // reverse array from k, n - 1
    // reverse array from 0, n - 1
    // time complexity -> O(n)
    // space complexity -> O (1 ) extra space
    private static void optimal(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
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
