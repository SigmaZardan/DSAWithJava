package hashing;

import java.util.HashMap;
import java.util.Map;

public class UsingMap {
    public static void main(String[] args) {
        // use maps when the size of the largest number in the array exceeds 10 ^ 9
        // that's when you can use a hash map


        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 5, 65, 112, 1889872983, 334, 53, 23432, 1234};
        int[] queries = {1, 2, 32};
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);


        }

        for (int query : queries) {
            System.out.println("Count of " + query + "=" + map.getOrDefault(query, 0));
            System.out.println("Making new things work");
            System.out.println("Again new things to do and explore for the memories");

        }
    }
}