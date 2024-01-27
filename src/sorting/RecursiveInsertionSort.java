package sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};

        insertion(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr, int index) {
        if (index == arr.length - 1) return;

        for (int j = index; j > 0; j--) {
            if (arr[j - 1] > arr[j]) swap(arr, j, j - 1);
        }
        insertion(arr, index + 1);
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
