/**
 * A generic interface representing a Safe that can store and retrieve
 * objects of type T, where T must be a subclass of Money.
 *
 * @param <T> the type of object stored in the safe (must extend Money)
 */
public interface Safe<T extends Money> {

    /**
     * Stores the given object in the safe.
     *
     * @param target the object to be stored
     * @return a unique key used to retrieve the object later
     */
    int lockIn(T target);

    /**
     * Retrieves an object from the safe using the provided key.
     *
     * @param key the key associated with the stored object
     * @return the object retrieved from the safe
     */
    T getFromSafe(int key);
}