public class Arrays2Basics5 {
    public static void main(String[] args) {
        // Initialize an array of size 50
        int[] numbers = new int[50];

        // Populate the array with values from 1 to 50
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;

            // Print values divisible by both 2 and 11
            if (numbers[i] % 2 == 0 && numbers[i] % 11 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println(); // Line break for clarity

        System.out.println("Array values incremented by 1 that are divisible by both 2 and 11:");

        // Check incremented values for divisibility by 2 and 11
        for (int j = 0; j < numbers.length; j++) {
            int incrementedValue = numbers[j] + 1;

            if (incrementedValue % 2 == 0 && incrementedValue % 11 == 0) {
                System.out.print(incrementedValue + " ");
            }
        }
    }
}