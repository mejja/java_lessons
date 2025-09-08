import java.util.Arrays;

public class Arrays2Basics4 {
    public static void main(String[] args) {
        // Create an integer array of size 50
        int[] arr = new int[50];

        // Populate the array with values from 1 to 50
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // Assign value i+1 to each index
            System.out.print(arr[i] + " "); // Print each value
        }

        System.out.println(); // Print a newline for separation

        System.out.println("Array Values + 1");

        // Print each array value incremented by 1
        for (int j = 0; j < arr.length; j++) {
            int increment = arr[j] + 1; // Increment each value by 1
            System.out.print(increment + " "); // Print incremented value
        }

        System.out.println(); // Print a newline for separation

        // Print the entire array using Arrays.toString for better formatting
        System.out.println(Arrays.toString(arr));
    }
}
