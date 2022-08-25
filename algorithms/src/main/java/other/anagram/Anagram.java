package other.anagram;

import java.util.Arrays;

/**
 * Java Program to Check if two strings are other.anagram. Example: SILENT & LISTEN
 */
public class Anagram {

    public Boolean anagramCheck(String firstWord, String secondWord) {
        if (firstWord.length() == secondWord.length()) {
            char[] charArrayFirst = firstWord.toLowerCase().toCharArray();
            char[] charArraySecond = secondWord.toLowerCase().toCharArray();

            Arrays.sort(charArrayFirst);
            Arrays.sort(charArraySecond);

            return Arrays.equals(charArrayFirst, charArraySecond);
        } else return false;
    }

}
