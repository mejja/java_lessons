import java.util.*;
public class Q6{
	public static void main(String[] args){
String[][][] arr = {
	{{"a", "b","c"}, {"d","e", null}}, 
	{{"x"}, null},
	{{"y"}}, 
	{{"z", "p"}, {}}};
String element = arr[0][0][1]; // Access the element at index [0][0][1]
String[] elementArray = {element}; // Wrap the element in an array
String elementString = Arrays.deepToString(elementArray); // Convert the array to a string
System. out.println(element);//b

	}
}



//Arrays.deepToString() expects an array as input, not a single element.
//so you can't perform string element Arrays.deepToString(arr[][][])