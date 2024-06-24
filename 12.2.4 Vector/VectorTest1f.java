import java.util.*;

public class VectorTest1f {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("apples");
        v.add("Pineapples");
        v.add("mangoes");
        v.add("oranges");
        v.add("watermelon");
        v.add("grapes");
           
        System.out.println(v);

        System.out.println("Get Element At Index  1"); 
        System.out.println(v.get(1));
    }
}