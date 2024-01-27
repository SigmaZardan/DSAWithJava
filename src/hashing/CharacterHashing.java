package hashing;

public class CharacterHashing {
    public static void main(String[] args) {
        String inputString = "aaaaaabbbbscssfsdfdsfdsfasfsfshafkhkwjfkjqhkjfhakshfkjasbfkjsbafkjashfjkhsk";
        char[] queries = {'a',
                'b',
                'y', 't', 'q', 'z'};
        // using character hashing
        // similar to number hashing
        // the hash array can be of size 26 is all the characters in the input string are either uppercase letters or lower
        // case letters, but they cannot have both letters combined
        // if the input string has both the upper case and lower case letters along with other characters then we can use
        // hash array of sizes 256 because there are a total of 256 characters
        // the given string has all the letters as lowercase
        int[] hash = new int[26];
        // prepopulate
        for (int i = 0; i < inputString.length(); i++) {
            int index = inputString.charAt(i) - 'a';
            hash[index]++;
        }

        // fetch
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i] - 'a';
            System.out.println(hash[index]);
        }
    }
}
