import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyCustomSet<E> implements Set<E> {
    private List<E> elements;

    public MyCustomSet() {
        elements = new ArrayList<>();
    }

    @Override
    public boolean add(E e) {
        if (contains(e)) {
            return false; // Element already exists, do not add
        }
        return elements.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return elements.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void clear() {
        elements.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }

    // Other methods from Set interface can be optionally overridden or left with default implementation

    @Override
    public boolean addAll(java.util.Collection<? extends E> c) {
        boolean changed = false;
        for (E e : c) {
            if (add(e)) {
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public boolean retainAll(java.util.Collection<?> c) {
        boolean changed = false;
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (!c.contains(it.next())) {
                it.remove();
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public boolean removeAll(java.util.Collection<?> c) {
        boolean changed = false;
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public boolean containsAll(java.util.Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }
}
