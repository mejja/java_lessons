import java.util.*; //import the all util classes

public class Challeng_One{
	public static void main(Strin  []args){
		Scanner myObj = new Scanner(System.in); // Create a scanner object
		System.out.println("What is your name?");
		String name = myObj.nextline();// read user imput
		System.out.println("What is your surname?");
		String surname = myObj.nextline();// read user input
		System.out.println("Enter your Date of birth (DD/MM/YYYY).");
		String date_of_birth = myObj.nextline();// read user input
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		Date date = sdf.parse(date_of_birth);
	    System.out.println("How far is your favourite store from your home?");
		int distance_from_store = myObj.nextInt();

	}
}