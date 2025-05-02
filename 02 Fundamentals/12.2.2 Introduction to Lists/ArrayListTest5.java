import java.util.*;

public class ArrayListTest5{
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>(); 
        // Adding elements to object of List interface Custom inputs 
        names.add(0, "Major"); 
        names.add(1, "Mbandi");
        names.add(2, "Amy"); 
        names.add(3, "Kiema"); 
        //List before clearance
        System.out.println(names);  
        //Get the size of the List
        System.out.println(names.size());
    }
}
