import java.util.*;

public class VectorTest7 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>(); 
        // Adding elements to object of List interface Custom inputs 
        names.add(0, "Major"); 
        names.add(1, "Mbandi");
        names.add(2, "Amy"); 
        names.add(3, "Kiema"); 

        //get() fetch element using indexes.
        System.out.println(names.get(1));//true  
        System.out.println(names.get(3));//false
    }
}