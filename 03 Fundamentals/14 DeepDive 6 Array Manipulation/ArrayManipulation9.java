public class ArrayManipulation9 {
    public static void main(String[]args){
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {3,14,12,6,14,7,19,11,0};

        printArray("arrayA before subtracting ",arrayA);       
        printArray("arrayB before subtracting ",arrayB);

        arrayA = sub( arrayA, arrayB);
        printArray("arrayA after subtracting ",arrayA);       
        printArray("arrayB after subtracting ",arrayB);
    }

    public static int [] sub(int[] arrayA,int[] arrayB){
        //Write code that create a new array that is the size a - duplicates
        //copy non-duplicates into the new array contigously.

        //define int duplicateCount = 0;
        //count duplicate and duplicateCount++ for each
        //create new array that is initialSize - duplicateCount;
        //write a loop that skips duplicate as it copies from a to b

        //Note this line is buggy as it returns arrayA
        //Your code should use the new array
        //This should return the new array
        return arrayA;
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
