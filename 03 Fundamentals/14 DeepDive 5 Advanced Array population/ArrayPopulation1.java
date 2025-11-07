public class ArrayPopulation1 {
    public static void main(String[] args) {
        // Create an integer array of size 10 (default values are 0)
        int[] array = new int[10];

        // Print the array using a custom method
        printArray("array: ", array);
    }

    // Method to print array contents with a prefix
    public static void printArray(String prefix, int[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);

            // Add comma between elements except after the last one
            if (i != arrayToPrint.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
