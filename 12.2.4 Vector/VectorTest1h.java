import java.util.*;

public class VectorTest1h {
    public static void main(String[] args) {

        Vector<String> f = new Vector<>();
        
        f.add("banana");
        f.add("apples");
        f.add("mangoes");
        f.add("oranges");
        f.add("grapes");
        f.add("tomato");

        Vector<String> f1 = new Vector<>();
        f1.add("banana");
        f1.add("apples");
        f1.add("mangoes");

        System.out.println("Check if f1 is a subset of F"); 
        System.out.println(f.containsAll(f1));//true
        System.out.println("Check if F is a subset of f1"); 
        System.out.println(f1.containsAll(f));//false
    }
}