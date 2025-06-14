import java.util.ArrayList;
import java.util.List;

public class SafeImpl<T>{
	private List<T> items = new ArrayList<>();
	public void lockIn(T target){
		items.add(target);
	}
	public T getFromSafe(int key){
        if (key >= 0 && key < items.size()) {
            return items.get(key);
        } else {
            throw new IndexOutOfBoundsException("Index: " + key + ", Size: " + items.size());
        }
      }
       // Getter for the list of items
    public List<T> getItems() {
        return items;
    }
    @Override
    public String toString() {
        return "SafeImpl{items=" + items + "}";
    }
}