public class Lambdas3 {
	public static void main(String... args) {
    Object o = (Runnable) () -> System.out.println("Howdy, world!");
    
    //casting Object(o) back to runnable since object has no run method
    ((Runnable)o).run();
  }
}