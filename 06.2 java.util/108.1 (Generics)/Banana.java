import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banana {

    @Override
    public String toString() {
        return "banana";
    }

    public static void main(String[] args) {
        // Create a list of Banana objects
        List<Banana> bananaList = new ArrayList<>();
        bananaList.add(new Banana());
        bananaList.add(new Banana());
        bananaList.add(new Banana());

        // Create an iterator from the list
        Iterator<Banana> iterator = bananaList.iterator();

        // Print each item using the iterator
        while (iterator.hasNext()) {
            Banana banana = iterator.next();
            System.out.println(banana.toString());
        }
    }
}