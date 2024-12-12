package Lab4.modules;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sentence, which is a sequence of words and punctuation marks.
 * This class manages a list of components that can be either words or punctuation,
 * and provides methods to manipulate and retrieve sentence content.
 */
public class Sentence {

    /** A list of components that make up the sentence, including words and punctuation. */
    private List<Object> components = new ArrayList<>();

    /**
     * Adds a component to the sentence. The component can be a word or punctuation.
     *
     * @param component the component to add, expected to be an instance of {@code Word} or
     *        {@code Punctuation}
     */
    public void addComponent(Object component) {
        components.add(component);
    }

    /**
     * Returns the list of components that constitute this sentence.
     * The components can be instances of {@code Word} or {@code Punctuation}.
     *
     * @return a list of components in the sentence
     */
    public List<Object> getComponents() {
        return components;
    }

    /**
     * Constructs and returns the textual representation of the sentence.
     * It concatenates words and punctuation symbols, ensuring proper spacing.
     *
     * @return the textual representation of the sentence as a {@code String}
     */
    public String getText() {
        StringBuilder sentence = new StringBuilder();
        for (Object component : components) {
            if (component instanceof Word) {
                sentence.append(((Word) component).getWord());
            } else if (component instanceof Punctuation) {
                sentence.append(((Punctuation) component).getSymbol());
            }
            sentence.append(" ");
        }
        return sentence.toString().trim().replaceAll("\\s+", " ");
    }
}

