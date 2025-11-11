public class ArrayPopulation3b {

    public static void main(String[] args) {
        // Declare and initialize an integer array of size 10
        int[] intArray = new int[10];

        // Declare and initialize a long array of size 10 (not used in this example)
        long[] longArray = new long[10];

        // Populate intArray such that each element equals its index
        for (int index = 0; index < intArray.length; index++) {
            intArray[index] = index;
        }

        // Print the contents of intArray
        printArray("intArray: ", intArray);

        // Optionally, print longArray to show default values (all zeros)
        // printArray("longArray: ", longArray);
    }

    /**
     * Prints the contents of an integer array in a formatted way.
     * Example: intArray: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     *
     * @param label         A prefix label to print before the array
     * @param arrayToPrint  The integer array to display
     */
    public static void printArray(String label, int[] arrayToPrint) {
        System.out.print(label + "[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i < arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Prints the contents of a long array in a formatted way.
     * Example: longArray: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
     *
     * @param label         A prefix label to print before the array
     * @param arrayToPrint  The long array to display
     */
    public static void printArray(String label, long[] arrayToPrint) {
        System.out.print(label + "[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i < arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

