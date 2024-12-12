package Lab4.modules;


public class Letter {

    /**
     * A subset of character classes, specifically letters
     **/
    private char character;

    /**
     * Creats a Letter
     **/
    public Letter(char character) {
        this.character = character;
    }

    /**
     * Character getter
     **/
    public char getCharacter() {
        return character;
    }

    /**
     * Checks if a character is a letter
     **/
    public boolean isLetter() {
        return Character.isLetter(character);
    }
}

