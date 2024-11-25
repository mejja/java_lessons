public class ArrayManipulation8 {
    public static void main(String[]args){
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {13,14,12,16,14,17,19,11,10};
       
        printArray("arrayA before merging ",arrayA);
        merge( arrayA, arrayB);
        printArray("arrayB before merging ",arrayB);
        printArray("merged Array ",merged);
    }

    public static int [] merge(int[] arrayA,int[] arrayB){
        //Write code that create a new array that is the size of the two arrays combined
        int[] merged= new int [arrayA.length + arrayB.length];
        //copy both array into the new array contigously.
        for(int i= 0,indexSize=0; i<arrayA.length; i++){
            merged[indexSize++]= arrayA[i];
        }
        for(int i = 0, indexSize=0; i<arrayB.length; i++){
            merged[indexSize++]=arrayB[i];
        }
        //Note this line is buggy as it returns arrayA
        //Your code should use the new array
        //This should return the new array
        return merged;
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
