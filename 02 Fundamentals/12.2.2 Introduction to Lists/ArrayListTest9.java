import java.util.*;

public class ArrayListTest9{
    public static void main(String[] args) {

        List<String> myName = new ArrayList<String>(); 
        // Adding elements to object of List interface Custom inputs 
        myName.add(0, "Major"); 
        myName.add(1, "Kiema");
        myName.add(2, "Mbandi"); 

        List<String> dadName = new ArrayList<String>(); 
        dadName.add(0, "Kiema");
        dadName.add(1, "Mbandi");

        List<String> mumName = new ArrayList<String>(); 
        mumName.add(0, "Florence");
        mumName.add(1, "Betty");

        //check matching elements using containsAll
        System.out.println(myName.containsAll(dadName));//true
        System.out.println(dadName.containsAll(myName));//false
        System.out.println(mumName.containsAll(myName));//false
    }
}
