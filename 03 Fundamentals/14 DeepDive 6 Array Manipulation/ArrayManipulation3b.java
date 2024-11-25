public class ArrayManipulation3b {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1};
        int[] sortedArray =new int[array.length];

        //copy value to sortedArray list
        for(int i=0; i<array.length;i++)
            sortedArray[i]=array[i];
       
        
        printArray("array before swapping ",sortedArray);
        System.out.println(" ");

        //sort the above array in ascendning order in-place. i.e. Using the same array
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] < sortedArray[i]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        printArray("Array After sorting: ", array);
        printArray("Sorted array: ", sortedArray);

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
