public class LambdaEg1 {
    public static void main(String[] args) {
        Runnable runner = ()->System.out.println("I am running");
        runner.run();
    }
}
