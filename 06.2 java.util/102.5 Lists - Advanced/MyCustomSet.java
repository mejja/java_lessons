import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * A simple custom implementation of the Set interface using a List.
 * Ensures no duplicate elements are stored.
 *
 * @param <E> the type of elements maintained by this set
 */
public class MyCustomSet<E> implements Set<E> {

    // Internal storage for elements
    private final List<E> elements;

    /**
     * Constructs an empty MyCustomSet.
     */
    public MyCustomSet() {
        elements = new ArrayList<>();
    }

    /**
     * Adds an element to the set if it does not already exist.
     *
     * @param e element to add
     * @return true if the element was added, false if it already exists
     */
    @Override
    public boolean add(E e) {
        if (contains(e)) {
            return false; // Element already exists, do not add
        }
        return elements.add(e);
    }

    /**
     * Removes the specified element from the set if present.
     *
     * @param o element to remove
