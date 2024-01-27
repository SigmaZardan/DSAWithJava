package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        // sort it using merge sort
        // thats it
        // merge uses divide and conquer algo
        // divide the numbers in the array
        // until there are single element
        // and then merge ( merge is done while sorting the current portions as well )

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        // base condition
        // which is if the single element is to be compared
        // when does this happen
        // when the recursive call has low and high equal
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();
        // the portion low till mid is the left half
        // the portion mid + 1 , high is the second half
        // to be merged
        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }
        while (j <= high) {
            temp.add(arr[j]);
            j++;
        }


        // populate this in the array
        // the portion of the array to populate these values of temp is low .. high
        for (int k = low; k <= high; k++) {
            arr[k] = temp.get(low - k);
        }
    }

}
