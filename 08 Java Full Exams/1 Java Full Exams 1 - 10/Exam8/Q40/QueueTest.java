import java.util .*;

public class QueueTest {
	public static void main(String[] args) {
		Deque<String> operations = new ArrayDeque<>();
		operations.push("Step 1");
		operations.offer("Step 2");
		operations.push("Step 3");

		List<String> executedOps = new ArrayList<>();
		while (!operations.isEmpty()) {
			executedOps.add(operations.pop());
		}
		System.out.println(executedOps);
	}
}