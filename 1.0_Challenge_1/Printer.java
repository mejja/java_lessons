public class Printer{
	public static void print( String name,  String surname,  String date_of_birth, double distance  ){
		System.out.println("Hello " + name+ " "+ surname );
		System.out.println("Your D.O.B is: " +  date_of_birth);
		System.out.println("The distance to you favourite store in miles is:" + distance*0.621371  + " " + "miles");
	}
}
		
		// System.out.println("You are "+ (years *31556952)  +" "+ "Seconds old");
		// System.out.println("You Age in Hexadecimal is: "+ Integer.toHexString(years)  + " Hex years old");
		// System.out.println("You Age in Binary is: "+ Integer.toBinaryString(years)  + "  years old");
		// //Distance
		// System.out.println("The distance to you favourite store in miles is:" + distance_in_miles  + " " + "miles");
		// System.out.println("The distance to you favourite store in meters is:" + distance_in_miles*1609.34 + " "+ "metres");
