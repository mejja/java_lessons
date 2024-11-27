 import java.util.Comparator;
 public class LambdaEg2 {
	public static void main(String[] args) {
    	Comparator<Object> comparator = (a,b)->a.hashCode() - b.hashCode();
    	System.out.println(comparator);
	}
}
