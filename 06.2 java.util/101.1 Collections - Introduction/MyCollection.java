import java.util.Collection;
import java.util.Iterator;

public class MyCollection<E> implements Collection<E> {

    @Override
    public boolean add(E e) {
        // For this example, the method does nothing and returns false
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        // For this example, the method does nothing and returns false
        return false;
    }

    @Override
    public void clear() {
        // For this example, the method does nothing
    }

    @Override
    public boolean contains(Object o) {
        // For this example, the method always returns false
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // For this example, the method always returns false
        return false;
    }

    @Override
    public boolean isEmpty() {
        // For this example, the method always returns true
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        // For this example, the method returns null
        return null;
    }

    @Override
    public boolean remove(Object o) {
        // For this example, the method always returns false
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // For this example, the method always returns false
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // For this example, the method always returns false
        return false;
    }

    @Override
    public int size() {
        // For this example, the method always returns 0
        return 0;
    }

    @Override
    public Object[] toArray() {
        // For this example, the method returns an empty array
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // For this example, the method returns an empty array
        return a;
    }

    public static void main(String[] args) {
        // Create an instance of MyCollection
        MyCollection<String> myCollection = new MyCollection<>();

        // Test the methods
        System.out.println("Is the collection empty? " + myCollection.isEmpty());
        boolean added = myCollection.add("Hello"); // Try to add an element
        System.out.println("Was the element added? " + added);
    }
}
