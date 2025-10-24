public class WhileTest2 {
    public static void main(String[] args) {
        int counter = 0;

        // Loop runs while counter is less than 10
        while (counter++ < 10) {
            // counter is incremented before the condition is checked
            // So printed values start from 1 and go up to 10
            if (counter % 2 == 0) {
                System.out.println("Counter = " + counter); // Prints even numbers only
            }
        }
    }
}
