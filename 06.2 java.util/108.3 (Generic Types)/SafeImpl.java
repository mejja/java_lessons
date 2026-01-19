import java.util.ArrayList;
import java.util.List;

/**
 * Generic implementation of the Safe interface.
 * Stores and retrieves objects of type T, where T extends Money.
 *
 * @param <T> type of object stored in the safe
 */
public class SafeImpl<T extends Money> implements Safe<T> {

    // Internal storage for safe items
    private final List<T> items = new ArrayList<>();

    /**
     * Stores an item in the safe.
     *
     * @param target the item to store
     * @return the index (key) where the item is stored
     */
    @Override
    public int lockIn(T target) {
        items.add(target);
        return items.size() - 1; // return key
    }

    /**
     * Retrieves an item from the safe using its key.
     *
     * @param key index of the stored item
     * @return the stored item
     * @throws IndexOutOfBoundsException if key is invalid
     */
    @Override
    public T getFromSafe(int key) {
        if (key < 0 || key >= items.size()) {
            throw new IndexOutOfBoundsException(
                    "Invalid key: " + key + ", Safe size: " + items.size());
        }
        return items.get(key);
    }

    /**
     * Returns all items currently in the safe.
     *
     * @return list of stored items
     */
    public List<T> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "SafeImpl{items=" + items + '}';
    }
}
