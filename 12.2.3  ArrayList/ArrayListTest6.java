import java.util.*;

public class ArrayListTest6 {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        
        name.add("Major");
        name.add("Kiema");
        name.add("Mbandi");
           
            System.out.println(name);

            System.out.println(name.contains("Major"));//true
            System.out.println(name.contains("Majork"));//false
        
    }
}