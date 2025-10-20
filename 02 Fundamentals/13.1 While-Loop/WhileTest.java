public class WhileTest {
    public static void main(String[] args) {
        int counter = 0;

        // Loop runs while counter is less than 10
        while (counter++ < 10) {
            // counter is incremented before printing, so output starts from 1
            System.out.println("Counter = " + counter);
        }
    }
}
