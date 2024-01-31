package array.easy;

import java.util.Arrays;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 4};
        moveZeros(arr);
        System.out.println(Arrays.toString(bruteForceSolution(arr)));
        System.out.println(Arrays.toString(arr));
    }


    private static int[] bruteForceSolution(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        return temp;
    }

    // this is the optimal approach
    // using two pointers
    // j pointer -> find the first zero at first
    // and then after than start iterating from i = j + 1 < n
    // and swap whenever we encounter a non-zero number ( i represents that number )
    // j will always point to zero
    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int j = 0;
        while (arr[j] != 0) j++;

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
