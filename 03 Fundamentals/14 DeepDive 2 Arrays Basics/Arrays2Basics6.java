public class Arrays2Basics6 {
    public static void main(String[] args) {
        // Declare an array of size 50
        int[] arr = new int[50];

        // Populate the array with values from 1 to 50
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // Print values divisible by both 2 and 11
        System.out.println("Values divisible by both 2 and 11:");
        for (int value : arr) {
            // Check if value is divisible by 2 AND 11
            if (value % 2 == 0 && value % 11 == 0) {
                System.out.print(value + " ");
            }
        }

        System.out.println("\n"); // Add spacing between outputs

        // Print incremented values (value + 1) that are divisible by both 2 and 11
        System.out.println("Incremented values divisible by both 2 and 11:");
        for (int value : arr) {
            int incremented = value + 1; // Increment the value by 1
            // Check if incremented value is divisible by 2 AND 11
            if (incremented % 2 == 0 && incremented % 11 == 0) {
                System.out.print(incremented + " ");
            }
        }
    }
}

