public class ArrayManipulation5 {
    public static void main(String[]args){

        int[] array = {3,4,2,6,4,7,9,1};
       
        printArray("array before adding ",array);

        array = add(array,11);
        
        printArray("array after adding",array);


    }

    //TODO: This method throws an exception please fix it.
    public static int [] add(int[] arrayToAddTo, int itemToAdd){

        int initialSize = arrayToAddTo.length;
        int newSize = arrayToAddTo.length+1;

        //Create an array that is equal to newSize
        //copy elements over

        //add the element at the end of the array
        //Note this line is buggy as it uses the old array
        //Your code should use the new array
        arrayToAddTo[newSize-2]=itemToAdd;

        //This should return the new array
        return arrayToAddTo;
    
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
