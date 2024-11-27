public class InnerClassExamples2c {
  public static void main(String... args) {
    Hello h = new Hello();
    h.r.run();
  }
}
class Hello {
  //using lambda expressions
  public Runnable r = () -> {
      System.out.println(this);
      System.out.println(toString());
    };

  public String toString() {
    return "Hello's custom toString()";
  }
}