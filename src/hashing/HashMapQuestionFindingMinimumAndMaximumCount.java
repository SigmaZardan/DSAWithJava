package hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapQuestionFindingMinimumAndMaximumCount {

    public static void main(String[] args) {
        int[] arr = {11, 13, 3, 14, 17, 3, 7, 9, 1 ,11, 9 ,15 ,5, 2, 2, 3 };
        int eMaxCount = 0;
        int eMinCount = 0;
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        // populate the map
        for (int number: arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        // iterate through the key sets
        for (int key: map.keySet()) {
            int count = map.get(key);
            if (count > maxCount) {

                maxCount = count;
                eMaxCount = key;
            }
            if (count < minCount) {
                minCount = count;
                eMinCount = key;
            }
        }
        System.out.println(eMaxCount);
        System.out.println(eMinCount);
    }
}
