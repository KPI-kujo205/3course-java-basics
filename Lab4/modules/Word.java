package Lab4.modules;

import java.util.ArrayList;
import java.util.List;

/**
 * A word, contains an array of Letters
 */
public class Word {

    /**
     * List of Words
     **/
    private List<Letter> letters = new ArrayList<>();


    /**
     * Adds letter to the end of current Word
     **/
    public void addLetter(Letter letter) {
        letters.add(letter);
    }


    /**
     * @return Word as a java String representation
     **/
    public String getWord() {
        StringBuilder word = new StringBuilder();
        for (Letter letter : letters) {
            word.append(letter.getCharacter());
        }
        return word.toString();
    }

    /**
     * Validates if a Word is palyndrome in linear time
     **/
    public boolean isPalindrome() {
        String word = getWord().toLowerCase();
        int len = word.length();
        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

