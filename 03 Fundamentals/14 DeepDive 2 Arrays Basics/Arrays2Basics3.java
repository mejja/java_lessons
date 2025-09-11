public class Arrays2Basics3 {
    public static void main(String[] args) {
        // Initialize the array with a set of integers
        int[] arr = {
            100, 20, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38,
        ..., 41, 42, 42, 43, 44, 45, 46, 47, 48, 49, 50
        };

        // Print array values that are divisible by both 2 and 11
        System.out.println("Array Values divisible by both 2 and 11:");
        for (int value : arr) {
            if (value % 2 == 0 && value % 11 == 0) {
                System.out.print(value + " ");
            }
        }

        System.out.println(); // Line break for clarity

        // Print incremented array values (value + 1) that are divisible by both 2 and 11
        System.out.println("Array Values + 1 divisible by both 2 and 11:");
        for (int value : arr) {
            int incremented = value + 1;
            if (incremented % 2 == 0 && incremented % 11 == 0) {
                System.out.print(incremented + " ");
            }
        }
    }
}