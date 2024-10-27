package Lab2;

import Lab2.modules.*;

public class MainProgram {
    /**
     * {@link}
     * https://docs.google.com/document/d/1HORjI_EKMg4O8lwgwdVWfEqn7L7ux3torbFjhOMRwF0/edit?tab=t.0
     *
     * {@summary}
     * StudentId - КВ13879017 C3 = 0 C17 = 13
     *
     * Variable type - StringBuilder
     * В заданому тексті знайти підрядок максимальної довжини, що є паліндромом, тобто читається
     * однаково зліва на право та справа на ліво.
     */

    public static void main(String args[]) {
        StringBuilder str = new StringBuilder(
                "Mom and dad saw Bob at noon eating soup with Hannah while a kazoo, radar, and racecar zoomed past the magical tooT-toot kayak.");


        System.out.println("Scanning sentence " + "\"" + str.toString() + "\"");
        StringBuilder polyndrom = StringBuilderOperations.findBiggestPolyndrom(str);
        System.out.println("The longest polyndrom is " + polyndrom.toString());
    }
}
