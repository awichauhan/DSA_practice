/*
this approach considers that string has ASCII values which having 128 unique characters
time complexity: 0(n); space complexity: 0(1)
 */

import java.util.*;

public class UniqueCharacterBooleanArray {
    public static boolean hasUniqueChars(String str) {
        if (str.length()> 128) {
            return false;  // more than 128 characters means duplicate exists
        }
        boolean[] charPresentArray = new boolean[128];  // boolean array of size 128 (for ASCII characters).

        // for loop used for iteration
        for( int i=0; i < str.length(); i++){
            int val = str.charAt(i);
            if(charPresentArray[val]) {
                return false;
            }
            charPresentArray[val] = true;
        }
        return true;

/*   enhanced for loop to iterate

        for (char c : str.toCharArray()) {  //str.toCharArray() converts the given string into a character array
            if (charPresentArray[c]) {   //Since char c is a character, Java automatically converts it to its ASCII integer value when used as an index.
                return false;
            }
            charPresentArray[c] = true;
        }
        return true;
 */
    }

    public static void main(String a[]){
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("str1 has unique values: " + hasUniqueChars(str1));
        System.out.println("str2 has unique values " + hasUniqueChars(str2));
    }
}


