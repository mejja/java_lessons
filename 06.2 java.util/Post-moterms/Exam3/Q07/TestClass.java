import java.util.*;
public class TestClass {
	public static void main(String[] args) {
		ArrayList<ObjectOne> list = new ArrayList<ObjectOne>();
		list.add(new ObjectOne());
		list.add(new ObjectOne());
		list.add(new ObjectOne());
		Collections.sort(list);
	}
class ObjectOne {
	private int x = 0;
	private int y = 0;
}
}