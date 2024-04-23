// Java Program to validate a date input to ensure 
// It's in a specific format using SimpleDateFormat 
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.Date; 

// Driver Class 
public class GFG 
{ 
	// Main Function 
	public static void main(String args[]) 
	{ 
		String date = "09/02/2024"; // input 
		// define the expected date format 
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		// set lenient to false to apply strict date parsing 
		dateFormat.setLenient(false); 

		try { 
			// parse the user input into a Date object 
			Date parsedDate = dateFormat.parse(date); 
			System.out.println( "Valid date format: " + dateFormat.format(parsedDate)); 
		} 
		catch (ParseException e) { 
			System.out.println( 
				"Invalid date format. " + date + " instead of: DD/MM/YYYY"); 
		} 
	} 
}
