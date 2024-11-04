public class BlockTest1b {
    public static void main(String[] args) {
        int sum = 0; // Variable to hold the sum of i from both blocks

        {
           int i = 1;
           System.out.println("Block 1 i = " + i);
           sum += i; // Add the value of i to sum
        }

        {
            int i = 1;
            System.out.println("Block 2 i = " + i);
            sum += i; // Add the value of i to sum
        }

        // Print the sum of i from both blocks
        System.out.println("Sum of i from both blocks = " + sum);
    }
}