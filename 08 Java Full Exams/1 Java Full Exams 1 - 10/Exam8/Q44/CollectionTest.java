import java.util .*;

public class CollectionTest {
	public static void main(String[] args) {
		List<Object> sequence = new ArrayList<>();
		sequence.add("alpha");
		sequence.add(42);
		sequence.add(true);

		List<Object> subSequence = new LinkedList<>(sequence.subList(0,2));
		sequence.addAll(1, subSequence);

		System.out.println(sequence);
	}
}