import java.util.*;

public class VectorTest1b {
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

        //remove banana in the vector
        v.remove(0);
        
        System.out.println(v);
    }
}
