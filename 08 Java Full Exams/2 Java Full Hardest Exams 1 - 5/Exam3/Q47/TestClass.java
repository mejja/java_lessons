import java.util.*;

public class TestClass{
	public static void main(String[] args){
		List<String> list = Arrays.asList("hello", "world");
		//1. Reference to a Static Method:
		ClassName::staticMethodName
		list.replaceAll(String::toUpperCase); // Refers to the static method toUpperCase of the String class

		//2. Reference to an Instance Method of a Particular Object:
		instance::instanceMethodName
		//Example
		String str = "hello";
		str::toUpperCase; // Refers to the instance method toUpperCase of the specific str object

		//3. Reference to an Instance Method of an Arbitrary Object of a Particular Type:
		ClassName::instanceMethodName
		//Example
		list.replaceAll(String::toLowerCase); // Refers to the instance method toLowerCase of the String class for each element in the list

		//4. Reference to a Constructor:
		ClassName::new
		//example
		Supplier<List<String>> listSupplier = ArrayList::new; // Refers to the constructor of ArrayList
	}

}