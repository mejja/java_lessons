public class ArrayManipulation2 {

    public static void main(String[] args) {
        // Initialize an integer array with predefined values
        int[] array = {3, 4, 2, 6, 4, 7, 9, 1};

        // Display the array before swapping
        printArray("array before swapping ", array);

        // Swap the first and last elements of the array
        int temp = array[0];     // Store the first element temporarily
        array[0] = array[7];     // Assign the last element to the first position
        array[7] = temp;         // Restore the original first element to the last position

        // Display the array after swapping
        printArray("array after swapping ", array);
    }

    /**
     * Prints the contents of an integer array in a formatted style.
     * Example output: array before swapping [3,4,2,6,4,7,9,1]
     *
     * @param prefix       A label to prefix the array output
     * @param arrayToPrint The array to be printed
     */
    public static void printArray(String prefix, int[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");

        // Iterate through the array and print each element
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);

            // Print a comma after each element except the last
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]"); // Close the array output
    }
}
