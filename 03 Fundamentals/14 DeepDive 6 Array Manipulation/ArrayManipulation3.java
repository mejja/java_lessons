public class ArrayManipulation3 {

    public static void main(String[] args) {
        // Declare and initialize an integer array with unsorted values
        int[] array = {3, 4, 2, 6, 4, 7, 9, 1};

        // Print the original array before sorting
        printArray("Array before sorting: ", array);

        // Sort the array in ascending order using in-place selection sort
        for (int i = 0; i < array.length; i++) {
            // Compare current element with all subsequent elements
            for (int j = i + 1; j < array.length; j++) {
                // If a smaller element is found, swap it with the current element
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Print the array after sorting
        printArray("Array after sorting: ", array);
    }

    /**
     * Prints the contents of an integer array with a label prefix.
     * Format: label [value1, value2, ..., valueN]
     *
     * @param prefix        A descriptive label to print before the array
     * @param arrayToPrint  The integer array to display
     */
    public static void printArray(String prefix, int[] arrayToPrint) {
        System.out.print(prefix + "[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            // Add comma between elements except after the last one
            if (i < arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

