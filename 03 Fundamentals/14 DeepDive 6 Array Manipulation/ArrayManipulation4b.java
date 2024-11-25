public class ArrayManipulation4b {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 6, 4, 7, 9, 1};
        int[] resizedArray = new int[2];

        printArray("array before overwriting ", array);
        for(int i=(array.length-1); i>(array.length-3); i--){
            array[i] = -1;
        }
        

        // Create a new array to contain only the second last and last elements (-1)
        for(int i=0, j=array.length-1; i<resizedArray.length; i++,j--){
            resizedArray[i] = array[j];
        }
        

        printArray("array after overwriting ", resizedArray);
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
        System.out.print("]\n");
    }
}
