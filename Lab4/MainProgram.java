package Lab4;

import Lab4.modules.*;
import java.util.StringTokenizer;



public class MainProgram {
    /**
     * {@link}
     * https://docs.google.com/document/d/1HORjI_EKMg4O8lwgwdVWfEqn7L7ux3torbFjhOMRwF0/edit?tab=t.0
     *
     * {@summary}
     * StudentId - КВ13879017 C3 = 0 C17 = 13
     *
     * Модифікувати лабораторну роботу №2 наступним чином:
     * для літер, слів, речень, розділових знаків та тексту створити окремі класи.
     * 
     * Слово повинно складатися з масиву літер,
     * речення з масиву слів та розділових знаків,
     * текст з масиву речень.
     * 
     * Замінити послідовність табуляцій та пробілів одним пробілом.
     * 
     * Створити клас, який складається з виконавчого методу,
     * що виконує описану дію з лабораторної роботи №2,
     * але в якості типів використовує створені класи.
     * Код повинен бути детально задокументований.
     * Код повинен відповідати стандартам Java Code Conventions (або Google Java Style Guide) та
     * бути
     * завантаженим на GitHub.
     *
     * Variable type - StringBuilder
     * В заданому тексті знайти підрядок максимальної довжини, що є паліндромом, тобто читається
     * однаково зліва на право та справа на ліво.
     */
    public static void main(String[] args) {
        String inputText =
                "Mom and dad saw Bob at noon eating soup with Hannah while a kazoo, lolololololol radar, and racecar zoomed past the magical tooT-toot kayak.";

        Text text = new Text();
        Sentence currentSentence = new Sentence();
        Word currentWord = new Word();

        for (char ch : inputText.toCharArray()) {
            if (Character.isLetter(ch)) {
                currentWord.addLetter(new Letter(ch));
            } else {
                if (currentWord.getWord().length() > 0) {
                    currentSentence.addComponent(currentWord);
                    currentWord = new Word();
                }
                if (StringBuilderOperations.isDelimeter(ch)) {
                    currentSentence.addComponent(new Punctuation(ch));
                }
            }
        }

        if (currentSentence != null) {
            text.addSentence(currentSentence);
        }

        System.out.println("Scanning text: " + text.getText());

        String longestPalindrome = text.findLongestPalindrome();

        System.out.println("The longest palindrome is: " + longestPalindrome);
    }

}
