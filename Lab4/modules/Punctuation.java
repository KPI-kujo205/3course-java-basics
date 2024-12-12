package Lab4.modules;

/**
 * Represents a punctuation symbol within a text.
 * This class encapsulates a character and provides utility methods
 * to work with punctuation symbols.
 */
public class Punctuation {

    /** The character symbol representing the punctuation. */
    private char symbol;

    /**
     * Constructs a new {@code Punctuation} object with the specified symbol.
     *
     * @param symbol the character symbol for this punctuation
     */
    public Punctuation(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Returns the character symbol of this punctuation.
     *
     * @return the character symbol
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * Determines if this symbol is a punctuation mark.
     * Utilizes the {@link StringBuilderOperations#isDelimeter(char)} method
     * to check if the character is a recognized punctuation symbol.
     *
     * @return {@code true} if the symbol is a punctuation mark, {@code false} otherwise
     */
    public boolean isPunctuation() {
        return StringBuilderOperations.isDelimeter(symbol);
    }
}
