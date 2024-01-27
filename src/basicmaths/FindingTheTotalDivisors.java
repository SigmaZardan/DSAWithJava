package basicmaths;

import java.util.ArrayList;
import java.util.List;

public class FindingTheTotalDivisors {
    public static void main(String[] args) {
        int number = 10;
        // storing the divisors in the list
        System.out.println(findAllDivisors(number));
        System.out.println(findFactors(number));
        }

// divisors is also known as factors
    private static List<Integer> findAllDivisors(int number) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                ans.add(i);
            }
        }
            return ans;
    }

    // optimized approach
    private static List<Integer> findFactors(int number) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // found a factor i
                ans.add(i);
                // the other factor is n / i
                if (i != (number / i)) {
                    ans.add(number / i);
                }
            }
        }
        return ans;
    }
}
