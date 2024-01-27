package sorting;

import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        // select the smallest element in the given range
        // swap it with the element in the first position in the range
        int[] arr = {5, 4,1, 3, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                // find the minimum
                if (arr[j] < arr[min]) min = j;
            }

            swap(arr, i, min);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}