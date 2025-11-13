public class ArrayPopulation4 {

    public static void main(String[] args) {
        // Declare and initialize an integer array of size 10
        int[] array = new int[10];

        // Populate the array with -1 using a for loop
        for (int index = 0; index < array.length; index++) {
            array[index] = -1; // Assign -1 to each element
        }

        // Print the contents of the array with a prefix label
        printArray("array: ", array);
    }

    /**
     * Prints the contents of an integer array in a formatted style.
     * Example output: array: [-1,-1,-1,-1,-1,-1,-1,-1,-1,-1]
     *
     * @param prefix       A string label to prefix the array output
     * @param arrayToPrint The integer array to be printed
     */
    public static void printArray(String prefix, int[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");

        // Iterate through the array and print each element
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);

            // Add a comma after each element except the last
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]"); // Close the array output
    }
}
