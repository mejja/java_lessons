import java.util.concurrent.ConcurrentLinkedQueue;

public class TestAdd{
	public static void main(String[] args){

		//create a ConcurrentLinkedQueue instance
		ConcurrentLinkedQueue<String> countries = new ConcurrentLinkedQueue<>();

		//add Items
		countries.add("Kenya");
		countries.add("Tanzania");
		countries.add("Uganda");
		countries.add("Ethiopia");
		countries.add("Somalia");
		countries.add("South sudan");
		countries.add("Rwanda");
		countries.add("Burundi");
		countries.add("South Africa");
		countries.add("Nigeria");

		//Print items in the list
		System.out.println(countries);
	}
}