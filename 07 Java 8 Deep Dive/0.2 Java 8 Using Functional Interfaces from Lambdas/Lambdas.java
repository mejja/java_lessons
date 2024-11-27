public class Lambdas {
  public static void main(String... args) {
    Runnable r = new Runnable() {
      public void run() {
        System.out.println("Howdy, world!");
      }
    };
    r.run();
  }
}