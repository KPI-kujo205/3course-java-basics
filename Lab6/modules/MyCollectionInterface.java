package Lab6.modules;

import java.util.Collection;

/**
 * Interface for a generic collection.
 *
 * @param <T> the type of elements in this collection
 */
public interface MyCollectionInterface<T> {
    boolean add(T element);

    boolean remove(T element);

    boolean contains(T element);

    int size();

    boolean isEmpty();

    void clear();
}

