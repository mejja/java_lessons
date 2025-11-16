public class ArrayManipulation2b {

    public static void main(String[] args) {
        // Declare and initialize an integer array with sample values
        int[] array = {3, 4, 2, 6, 4, 7, 9, 1};

        // Print the original array before swapping
        printArray("Array before swapping: ", array);

        // Reverse the array in-place using two-pointer technique
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            // Swap elements at positions 'left' and 'right'
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        // Print the array after swapping
        printArray("Array after swapping: ", array);
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