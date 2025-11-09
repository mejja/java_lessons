public class ArrayPopulation2 {

    public static void main(String[] args) {
        // Create an integer array of size 10
        int[] numbers = new int[10];  // All elements default to 0

        // Set the value at index 4 to -1
        numbers[4] = -1;

        // Print the contents of the array with a label
        printArray("Array: ", numbers);
    }

    /**
     * Prints the contents of an integer array in a formatted way.
     * Example output: Array: [0, 0, 0, 0, -1, 0, 0, 0, 0, 0]
     *
     * @param label         A prefix label to print before the array
     * @param arrayToPrint  The integer array to display
     */
    public static void printArray(String label, int[] arrayToPrint) {
        System.out.print(label);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);

            // Add a comma after each element except the last
            if (i != arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
