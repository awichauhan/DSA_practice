public class CheckPermutation {
    public static boolean arePermutationsCount(String str1, String str2) {
        // If lengths are not equal, they can't be permutations
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a frequency array for characters (assuming ASCII)
        int[] charCounts = new int[128]; // Assuming ASCII 128 characters  (need to ask the interviewer)

        // Count occurrences of characters in str1
        for (char c : str1.toCharArray()) {
            charCounts[c]++;
        }

        // Subtract occurrences from str2
        for (char c : str2.toCharArray()) {
            charCounts[c]--;
            // If any character count becomes negative, they are not permutations
            if (charCounts[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (arePermutationsCount(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are permutations of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT permutations.");
        }
    }
}
