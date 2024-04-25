import java.io.*;// for date&time manipulation
import java.text.SimpleDateFormat;
import java.util.Date; 
import java.text.ParseException;
//Future date
import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;

public class DateValidator{
	public static boolean dateIsValid(String date_of_birth){
		// check if date is not null
		if (date_of_birth.trim().equals(""))
			{
				return true;
	}//if not null
	
	else{
		//Format date
		SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
		sdfrmt.setLenient(false);

		try{
			Date JavaDate =sdfrmt.parse(date_of_birth);
			// System.out.println("Thank for entering date in a Valid format");
		}

		// For invalid date format
		catch(ParseException e){
			System.out.println("you have entered an invalid Date format");
			return false;
		}
		// return true if date is valid
		return true;

		}
	}
//method to validate if date entered is not of future date.
public static boolean pastValidDate(String date_of_birth){
	//Format date with slashes
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		//Query system current date
		LocalDate today = LocalDate.now();

		try{
			// Parse the input date string with the specified format of slashes
			LocalDate javaDate = LocalDate.parse(date_of_birth, formatter);
			//check if the parsed date is before or equal to today's date
			return !javaDate.isAfter(today);
		}catch(Exception e){
			//Handle parsing exception
			return false;
		}	
		
}

}