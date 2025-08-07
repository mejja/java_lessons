import java.util.ArrayList;
import java.util.List;

public class GenericsEg1 {
    public static void main(String[] args) {
   	 List<String> strings = new ArrayList<String>();
   	 strings.add("1");
   	 strings.add("3");
   	 strings.add("3");
   	 System.out.println("strings = "+strings);
    }
}
