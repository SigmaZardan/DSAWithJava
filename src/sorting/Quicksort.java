package sorting;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        // quick sort
        // divide and conquer algorithm
        // steps :
        // choose a pivot element:
        // 1. pivot element can be thefirst element
        //2. pivot can be the last element
        // 3. pivot can also be the middle element
        // /choose the correct position of the pivot
        // the correct position of the pivot is the position in which
        // all the smaller elements than the pivot will lie at its left
        // all the larger elements than the pivot will be at its right
        // after finding the pivot position
        // use recursion to perform the same algo to theleft part from the pivot
        // and also for the right part from thepivot
        // time complexity -> best case ( is when we choose the middle element as the pivot element )
        // O(n * logn)
        // worst case ( is when we take the smallest or largest element as the pivot element
        // O (n ^ 2)
        // space complexity -> O(1) auxiliary space
        int[] arr = {5, 4, 3, 2, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = findPivot(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int findPivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i < high) i++;
            while (arr[j] > pivot && j > low) j--;
            if (i < j) swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


}
