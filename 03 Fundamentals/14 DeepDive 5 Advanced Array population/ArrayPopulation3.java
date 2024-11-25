public class ArrayPopulation3b {
    public static void main(String[]args){
        int[] arrayInt = new int[10];
        long[] arrayLong = new long[10];

        //Write a for loop that assigns the position as the value of the index.
        for(int i=0; i<arrayInt.length; i++)
            arrayInt[i]=i;


        //calling print function
        printArray("arrayInt: ",arrayInt);
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

    public static void printArray(String prefix,long[] arrayToPrint){
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
