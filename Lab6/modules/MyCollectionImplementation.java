package Lab6.modules;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

/**
 * A generic collection class implementing MyCollectionInterface using a Set.
 *
 * @param <T> the type of elements in this collection
 */
public class MyCollectionImplementation<T> implements MyCollectionInterface<T> {
    private Set<T> internalSet;
    private int initialCapacity = 15;
    private int currentCapacity;

    /**
     * Constructs an empty CustomSetCollection with an initial capacity.
     */
    public MyCollectionImplementation() {
        this.internalSet = new HashSet<>(initialCapacity);
        this.currentCapacity = initialCapacity;
    }

    /**
     * Constructs a CustomSetCollection containing the specified element.
     *
     * @param element the element to be added to the collection
     */
    public MyCollectionImplementation(T element) {
        this();
        add(element);
    }

    /**
     * Constructs a CustomSetCollection containing the elements of the specified collection.
     *
     * @param collection the collection whose elements are to be placed into this collection
     */
    public MyCollectionImplementation(Collection<T> collection) {
        this();
        this.internalSet.addAll(collection);
        checkCapacity();
    }

    @Override
    public boolean add(T element) {
        if (!internalSet.contains(element)) {
            if (internalSet.size() >= currentCapacity) {
                resize();
            }
            return internalSet.add(element);
        }
        return false;
    }

    @Override
    public boolean remove(T element) {
        return internalSet.remove(element);
    }

    @Override
    public boolean contains(T element) {
        return internalSet.contains(element);
    }

    @Override
    public int size() {
        return internalSet.size();
    }

    @Override
    public boolean isEmpty() {
        return internalSet.isEmpty();
    }

    @Override
    public void clear() {
        internalSet.clear();
    }

    /**
     * Resizes the internal capacity of the collection by increasing it by 30%.
     */
    private void resize() {
        currentCapacity += currentCapacity * 30 / 100;
        // Note: Actual resizing logic for a Set is abstract because Java's Set handles resizing
        // internally.
        // We're managing capacity logic here for adherence to the task description.
    }

    /**
     * Checks if the capacity needs to be adjusted based on current size.
     */
    private void checkCapacity() {
        while (internalSet.size() > currentCapacity) {
            resize();
        }
    }
}

