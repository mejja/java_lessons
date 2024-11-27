public class List13 {
	public static void main(String... args) {
    StringBuilder message = new StringBuilder();
    Runnable r = () -> System.out.println(message);
    message.append("Howdy, ");
    message.append("world!");
    r.run();
  }
}