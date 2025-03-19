import java.util.*;

public class StringCompression {
    public static int compressString(char[] str) {
        int index_write = 0; // Position to write the compressed characters
        int i_read = 0;  // Position to read characters

        while (i_read < str.length) {
            char currentChar = str[i_read];
            int count = 0;

            // Count occurrences of current character
            while (i_read < str.length && str[i_read] == currentChar) {
                i_read++;
                count++;
            }

            // Write the character to the array
            str[index_write++] = currentChar;

            // If count > 1, write the count as separate digits
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    str[index_write++] = c;
                }
            }

        }
        return index_write;

    }

    public static void main(String a[]){
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println("Original chars array: " + Arrays.toString(chars));

        int newLength = compressString(chars);

        System.out.println("Compressed length: " + newLength);
        System.out.println("Compressed chars array: " + Arrays.toString(Arrays.copyOf(chars, newLength)));
    }
}