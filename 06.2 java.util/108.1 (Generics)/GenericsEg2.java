import java.util.HashMap;
import java.util.Map;

public class GenericsEg2 {
    public static void main(String[] args) {
        Map<Integer,String> strings = new HashMap<Integer,String>();
  	  strings.put(1,"one");
  	  strings.put(2,"two");
   	 strings.put(3,"three");
   	 System.out.println("strings = "+strings);
    }
}
