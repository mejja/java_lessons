public class InnerClassExamples2b {
  public static void main(String... args) {
    Hello h = new Hello();
    h.r.run();
  }
}
class Hello {
  public Runnable r = new Runnable() {
      public void run() {
        System.out.println(Hello.this);
        System.out.println(Hello.this.toString());
      }
    };

  public String toString() {
    return "Hello's custom toString()";
  }
}