import java.util.*;

public class CheckPangram{
    public static boolean checkPangram(String str){
        boolean[] letterArray = new boolean[26];
        char aCharacter = 'a';
        int asciiA = (int) aCharacter;

        for(int i =0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            int index = currentChar - asciiA;
            letterArray[index] = true;
        }
        for(int j = 0; j < letterArray.length; j++){
            if(letterArray[j] == false){
                return false;
            }
        }
        return true;
    }

    public static void main(String a[]){
        String input = "thequickbrownfoxjumpsoverthelazydog";
        String input2 = "helloworld";
        System.out.println("the input string is pangram:  " + checkPangram(input));
        System.out.println("the input2 string is pangram:  " + checkPangram(input2));
    }
}