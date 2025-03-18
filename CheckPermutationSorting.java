/*
time complexity: O(n log n); space complexity: O(n)
 */

import java.util.Arrays;

public class CheckPermutation {
    public static boolean arePermutationsSort(String str1, String str2) {
        // If lengths are not equal, they can't be permutations
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "secure";
        String str2 = "rescue";

        if (arePermutationsSort(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are permutations of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT permutations.");
        }
    }
}
