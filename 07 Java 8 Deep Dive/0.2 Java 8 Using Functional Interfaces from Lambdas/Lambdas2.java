public class Lambdas2 {
	public static void main(String... args) {
    Runnable r2 = () -> System.out.println("Howdy, world!");
    r2.run();
  }
}