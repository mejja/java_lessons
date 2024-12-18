import java.util.ArrayList;
public class Q10b {
    public static void main(String[] args) {
        // Create an ArrayList to hold objects of any type
        ArrayList<Object> list = new ArrayList<>();

        // Add objects of different types to the ArrayList
        list.add("A");  // Adding a String object
        list.add(123);  // Adding an Integer object
        list.add(3.14); // Adding a Double object

        for (Object obj : list) {
            System.out.println(obj); // This will print: A, 123, 3.14
        }
    }
}
