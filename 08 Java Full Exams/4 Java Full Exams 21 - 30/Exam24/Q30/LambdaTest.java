class LambdaTest {
	public static void main(String[] args) {
		DontDoAnything beldle = () -> System.out.println("be idle");
		beldle.doNothing();
	}
}

interface DoNothing {
	default void doNothing() { System.out.println("doNothing"); }
}
@FunctionalInterface
interface DontDoAnything extends DoNothing {
	@Override
	abstract void doNothing();
}
