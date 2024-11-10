import java.util.*;

public class VectorTest1j {
    public static void main(String[] args) {

        Vector<String> phrase = new Vector<>();
        
        phrase.add("I");
        phrase.add("am");
        phrase.add("learning");
        phrase.add("Java");
        phrase.add("with");
        phrase.add("OpenLearn");
        //print the vector elements
        System.out.println("Vector Phrase"+ phrase); 
        
        Object[] arr = phrase.toArray();

        System.out.println("The Array is: "); 
        for(int j =0; j<arr.length; j++){
            System.out.println(arr[j]);
        }       
    }        
}
