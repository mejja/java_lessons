import java.util.Arrays;

public class ArraysBasics7 {
    public static void main(String[] args) {

        // Declare a 2D array with 100 rows and 30 columns
        int[][] myNumbers = new int[100][30];

        // Initialize a counter to populate the array
        int value = 1;

        // Populate the array with values from 1 to 3000
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                myNumbers[i][j] = value; // Assign current value
                value++; // Increment value for next cell

                // Stop populating once value exceeds 3000
                if (value > 3000) {
                    break;
                }
            }

            // Break outer loop if value exceeds 3000
            if (value > 3000) {
                break;
            }
        }

        // Print all array values incremented by 1
        System.out.println("Array Values + 1");

        // Loop through each row of the 2D array
        for (int[] row : myNumbers) {
            // Loop through each element in the row
            for (int i : row) {
                int increment = i + 1; // Increment value by 1
                System.out.print(increment + " "); // Print incremented value
            }
        }
    }
}