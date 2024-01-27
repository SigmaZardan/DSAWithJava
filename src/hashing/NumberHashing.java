package hashing;

public class NumberHashing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 1, 1, 1, 1, 3, 3, 3, 12};
        // we are given that the max number in the array is 12
        // which will be the size of the hash function
        int[] queries = {1, 2, 11};
        int[] hash = new int[13];

        // pre populate
        for (int number : arr) {
            hash[number]++;
        }
        // fetching
        for (int num : queries) {
            System.out.println(hash[num]);
        }
    }
}
