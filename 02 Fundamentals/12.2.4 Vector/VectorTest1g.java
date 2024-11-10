import java.util.*;

public class VectorTest1g {
    public static void main(String[] args) {

        Vector<String> f = new Vector<>();
        
        f.add("banana");
        f.add("apples");
        f.add("mangoes");
        f.add("oranges");

        System.out.println("F Before merging"); 
        System.out.println(f);

        Vector<String> v = new Vector<>();
        v.add("sukumawiki");
        v.add("cabbage");
        v.add("spinach");
           
        f.addAll(v);

        System.out.println("F vector after merging with v"); 
        System.out.println(f);
    }
}