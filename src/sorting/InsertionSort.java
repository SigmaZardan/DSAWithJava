package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 3};
        // what is insertion sort
        // first sort two elements
        // then three and then four and so on
        // at every step
        // i = 1 <= n - 1
        // j = i > 0
        // compares j and then j - 1
        // and then it will sort the first two elements
        // if the element at j - 1 index is greater then swap them
        // at any given point if you find that the element at j - 1 is larger then break
        int n = arr.length;

        for (int i = 1; i <= n - 1; i++) {
            boolean isSwapped = false;

            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
                if (!isSwapped) break;
            }
        }


        System.out.println(Arrays.toString(arr));
    }


}
