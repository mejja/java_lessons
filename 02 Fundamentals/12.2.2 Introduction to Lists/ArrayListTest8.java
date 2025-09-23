import java.util.*;

public class ArrayListTest8{
    public static void main(String[] args) {

        List<String> myName = new ArrayList<String>(); 
        // Adding elements to object of List interface Custom inputs 
        myName.add(0, "Major"); 
        myName.add(1, "Kiema");
        myName.add(2, "Mbandi"); 
        System.out.println(myName);

        List<String> dadName = new ArrayList<String>(); 
        dadName.add(0, "Kiema");
        dadName.add(1, "Mbandi");  

        //merging two arrays using addAll().
        myName.addAll(dadName);
        //myName list after merging with dadaName
        System.out.println(myName);//t
    }
}
