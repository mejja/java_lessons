public class ArrayManipulation5b {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 6, 4, 7, 9, 1};

        printArray("array before adding: ", array);

        array = add(array, 11);

        printArray("array after adding: ", array);
    }

    public static int[] add(int[] arrayToAddTo, int itemToAdd) {
        int initialSize = arrayToAddTo.length;
        int newSize = initialSize + 1;

        // Create a new array with the updated size
        int[] newArray = new int[newSize];

        // Copy elements from the original array to the new array
        for (int i = 0; i < newSize; i++) {
            if(i<initialSize)
                newArray[i] = arrayToAddTo[i];
            else 
                newArray[newSize - 1] = itemToAdd;
        }

        // Return the new array
        return newArray;
    }

    public static void printArray(String prefix, int[] arrayToPrint) {
        System.out.print(prefix);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
