import java.util.*;
import java.util.function.Predicate;

public class TestClass{
	public static boolean checkList(List list, Predicate<List> p){
		return p.test(list);
	}
	public static void main(String[] args) {
		boolean b = //write code here
		System.out.println(b);
	}
}