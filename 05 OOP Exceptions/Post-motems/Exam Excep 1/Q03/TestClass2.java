import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestClass2 {

    public static boolean checkList(List<String> list, Consumer<List<String>> consumer) {
        consumer.accept(list); // Perform the modification
        return true; // Return true assuming the modification was successful
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        boolean b = checkList(list, al -> al.add("hello"));
        System.out.println(b); // Output: true

        System.out.println(list); // Output: [hello]
    }
}
