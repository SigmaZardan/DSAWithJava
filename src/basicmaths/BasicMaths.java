package basicmaths;

public class BasicMaths {
    public static void main(String[] args) {
        // find the total number of digits in a given number
        int number = 1;
        // using the concept of loop and
        // also the concept of / 10 , we can easily solve this one
        System.out.println(totalNumberOfDigits(number));
        System.out.println(totalNumberOfDigits(number));
        System.out.println("Reversed Number: " + reverseNumber(number));
        System.out.println(isPalindrome(number));
    }

    // reverse a number
    private static int reverseNumber(int number) {
        int digits = totalNumberOfDigitsSimple(number);
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber += digit * Math.pow(10, digits - 1);
            number /= 10;
            digits--;
        }
        return reversedNumber;

    }

    // check if a number is palindrome or not
    private static boolean isPalindrome(int number) {
        int reversedNumber = reverseNumber(number);
        return number == reversedNumber;
    }



    // one way
    // here the time complexity will be O(totalNumberOfDigits)
    private static int totalNumberOfDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // another way is simply to use a direct formula
    // O(1)
    private static int totalNumberOfDigitsSimple(int number) {
        return (int) Math.log10(number) + 1;
    }
}
