package hashing;

import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 3, 4, 12, 14};
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            int input = scanner.nextInt();
            System.out.println(findCount(input, arr));
        }

    }
    // brute force solution

    private static int findCount(int number, int[] arr) {
        int count = 0;
        for (int num:arr) {
            if (number == num) count++;
        }
        return count;
    }
}
