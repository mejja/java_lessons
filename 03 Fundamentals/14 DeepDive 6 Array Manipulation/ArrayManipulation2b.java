public class ArrayManipulation2b {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1};

        printArray("array before swapping ", array);
        for (int i = 0, j = (array.length - 1); i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            }
printArray("array after swapping ", array);


    }
    
    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
            	System.out.print(",");
            }

            
        }
        System.out.print("]\n");
    }
}
