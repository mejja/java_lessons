import java.util .*;

public class SortingTest {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		items.add(new Item("C", 3));
		items.add(new Item("A", 1));
		items.add(new Item("B", 2));

		Collections.sort(items);
		System.out.println(items);
	}
}

class Item implements Comparable<Item> {
	String name;
	int priority;

	Item(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	public int compareTo(Item other) {
		return Integer.compare(this.priority, other.priority);
	}
	public String toString() {
		return name;
	}
}
