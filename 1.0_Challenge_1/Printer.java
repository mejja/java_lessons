public class Printer{
	public static void print( String name, String surname, long age, double distance_in_miles){
		System.out.println("Hello "+ name + " "+surname+"!!");
		System.out.println("You are " + age+" years old" );
		System.out.println("The distance form the shop is " + distance_in_miles +" miles" );
		//Brownie points
		System.out.println("The age in seconds is "+ age*31_556_952  + " Secs Old" );
	}

}