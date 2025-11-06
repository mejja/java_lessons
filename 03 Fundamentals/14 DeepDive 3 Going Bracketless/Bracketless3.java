public class Bracketless3 {
    public static void main(String[] args) {
        int i = 0;

        // do-while loop executes at least once
        do {
            // Only print if i > 1
            if (i > 1)
                System.out.println("Greater than " + i);

            // Increment i after the if block
            i++;
        } while (i < 10);
    }
}
