public class Task {
	String title;
	static class Counter {
	int counter = 0;
	void increment() { counter++; }
}
	public static void main(String[] args) {
	// insert code here
		new Task.Counter().increment();
	}

}
/*Which statement, inserted at line 8, enables the code to compile?

A. newTask(.new Counter().increment();

B. newTask().Counter().increment();

C. new Task.Counter().increment(;

D. Task.Counter().increment(;

E. Task.Counter.increment();*/