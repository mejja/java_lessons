public class ArrayManipulation3b {

    public static void main(String[] args) {
        // Original unsorted array
        int[] array = {3, 4, 2, 6, 4, 7, 9, 1};

        // Create a new array to hold the sorted copy
        int[] sortedArray = new int[array.length];

        // Copy values from the original array to the sorted array
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        // Print the copied array before sorting
        printArray("Array before sorting: ", sortedArray);
        System.out.println();

        // Sort the copied array in ascending order using selection sort
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] < sortedArray[i]) {
                    // Swap elements if a smaller value is found
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        // Print both the original and the sorted arrays
        printArray("Original array (unchanged): ", array);
        printArray("Sorted array              : ", sortedArray);
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
