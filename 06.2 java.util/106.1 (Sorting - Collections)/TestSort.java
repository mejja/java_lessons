import java.util.*;
 
public class TestSort{
	public static void main(String[] args){
		ArrayList<String> unsortedArray = new ArrayList<>();

		unsortedArray.add("Cherry");
        unsortedArray.add("Apple");
        unsortedArray.add("Banana");

    //print the unsorted arrayList
    System.out.println(unsortedArray);

     Collections.sort(unsortedArray);

    //sorted arrayList
    System.out.println(unsortedArray);
	}
}