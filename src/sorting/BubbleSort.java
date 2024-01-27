package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // The largest value will be at the correct position or at the last.
        // after each step
        // The algorithm is performed using adjacent swapping.

        int[] arr = {5, 3, 2, 1};
        int n = arr.length;
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {


        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            boolean isSwapped = false;
            for (int j = 0; j < i; j++) {

                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
                if (!isSwapped) break;
            }
        }

    }
}
