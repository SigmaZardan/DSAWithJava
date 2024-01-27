package sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        // perform the bubble sort recursively
        bubbleSort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr, int index) {
        if (index == 0) return;

        for (int j = 0; j < index; j++) {
            if (arr[j + 1] > arr[j]) swap(arr, j, j + 1);
        }
        bubbleSort(arr, index - 1);
    }
    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
