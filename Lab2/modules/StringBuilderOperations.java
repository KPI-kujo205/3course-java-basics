package Lab2.modules;

import java.util.ArrayList;
import java.lang.StringBuilder;
import java.nio.charset.Charset;
import Lab1.modules.MatrixOperationException;


/**
 * 
 * - Student Name - Ivan Kuts (Іван Куц)
 * - Group - IM-22
 * -
 * [Task](https://docs.google.com/document/d/1HORjI_EKMg4O8lwgwdVWfEqn7L7ux3torbFjhOMRwF0/edit?tab=t.0#heading=h.1tj95ple0sjo)
 * - C3 = 0; C17 = 13;
 * - Variable type - StringBuilder
 * - В заданому тексті знайти підрядок максимальної довжини, що є паліндромом, тобто читається
 * однаково зліва на право та справа на ліво.
 * 
 */
public class StringBuilderOperations {

    /**
     * {@summary} finds a biggest polyndrom in a StringBuilder string instance,
     * returns StringBuilder with no value if no polyndrom was found
     */
    public static StringBuilder findBiggestPolyndrom(StringBuilder str) {

        StringBuilder biggestPolyndrom = new StringBuilder();
        StringBuilder polyndromCandidate = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (StringBuilderOperations.isDelimeter(ch)) {
                if (StringBuilderOperations.isWordPolyndrom(polyndromCandidate)) {
                    if (polyndromCandidate.length() > biggestPolyndrom.length()) {
                        biggestPolyndrom = new StringBuilder(polyndromCandidate);
                    }
                }

                polyndromCandidate = new StringBuilder();
            } else {
                polyndromCandidate.append(ch);

                if (StringBuilderOperations.isWordPolyndrom(polyndromCandidate)) {
                    if (polyndromCandidate.length() > biggestPolyndrom.length()) {
                        biggestPolyndrom = new StringBuilder(polyndromCandidate);
                    }
                }
            }
        }

        return biggestPolyndrom;
    }


    /**
     * {@summary} check is a word is polyndrom
     */
    private static boolean isWordPolyndrom(StringBuilder word) {
        int len = word.length();

        for (int i = 0; i < len / 2; i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            char chFromEnd = Character.toLowerCase(word.charAt(len - i - 1));

            if (ch != chFromEnd) {
                return false;
            }

        }
        return true;
    }

    /**
     * {@summary} check if delimeter character
     */
    public static boolean isDelimeter(char ch) {
        return Character.isSpaceChar(ch) || ch == '.' || ch == ',' || ch == '!' || ch == '?'
                || ch == ';' || ch == '—' || ch == ':' || ch == '…';
    }


}
