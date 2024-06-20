import java.util.*;

public class ArrayListTest4{
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>(); 
        // Adding elements to object of List interface Custom inputs 
        names.add(0, "Major"); 
        names.add(1, "Mbandi");
        names.add(2, "Amy"); 
        names.add(3, "Kiema"); 

        //Array before clearance
        System.out.println(names);
        //empty the List
        names.clear();
        //Printing List after clearance
        System.out.println(names);
    }
}
