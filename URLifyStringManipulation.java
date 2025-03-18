public class URLifyStringManipulation {
    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;

        // Count number of spaces
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        // Calculate new index position
        index = trueLength + spaceCount * 2;

        // If the array has extra space, put a null character at the new end
        if (trueLength < str.length) str[trueLength] = '\0';

        // Start replacing from the end
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }

    public static void main(String[] args) {
        char[] str = "Awantika  Chauhan  ".toCharArray(); // Extra space at end
        int trueLength = 50; // Length of "Mr John Smith"

        replaceSpaces(str, trueLength);
        System.out.println(new String(str));
    }
}
