import java.util.*;

public class VectorTest3 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>(); 
        // Adding elements to object of List interface Custom inputs 
        names.add(0, "Major"); 
        names.add(1, "Mbandi");
        names.add(2, "Amy"); 
        names.add(3, "Kiema"); 
        
        System.out.println(names);

        //remove element by index position i.e 1
        names.remove(1);
        System.out.println(names);
        //remove  by matching value of elements 
        names.remove("Kiema");
        System.out.println(names);
        
    }
}