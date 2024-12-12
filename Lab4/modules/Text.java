package Lab4.modules;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> sentences = new ArrayList<>();

    /**
     * Adds new sentense to a text
     * 
     * @param sentence - sentence to add to the text
     */
    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }

    /**
     * @return Returns List of Sentences
     */
    public List<Sentence> getSentences() {
        return sentences;
    }


    /**
     * Returns text from in its original String representation
     */
    public String getText() {
        StringBuilder text = new StringBuilder();
        for (Sentence sentence : sentences) {
            text.append(sentence.getText()).append(" ");
        }
        return text.toString().trim();
    }



    /**
     * 
     * Finds the biggest pakindrome in a text and returns it using linear search
     * 
     * @param text - text to search in
     */
    public String findLongestPalindrome() {
        String longestPalindrome = "";

        for (Sentence sentence : this.getSentences()) {
            for (Object component : sentence.getComponents()) {
                if (component instanceof Word) {
                    Word word = (Word) component;
                    String wordStr = word.getWord();

                    if (word.isPalindrome() && wordStr.length() > longestPalindrome.length()) {
                        longestPalindrome = wordStr;
                    }
                }
            }
        }

        return longestPalindrome;
    }
}
